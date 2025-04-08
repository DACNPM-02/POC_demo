package com.example.pocdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.pocdemo.model.Accommodation;
import com.example.pocdemo.repository.elastic.AccommodationElasticRepository;
import com.example.pocdemo.repository.jpa.AccommodationRepository;

@Service
public class DataSyncService {

    private final AccommodationRepository mysqlRepository;
    private final AccommodationElasticRepository elasticRepository;

    @Autowired
    public DataSyncService(AccommodationRepository mysqlRepository, 
                          AccommodationElasticRepository elasticRepository) {
        this.mysqlRepository = mysqlRepository;
        this.elasticRepository = elasticRepository;
    }

    @Transactional
    public void syncAllData() {
        // Delete all existing data in Elasticsearch
        elasticRepository.deleteAll();
        
        // Get all data from MySQL
        Iterable<Accommodation> accommodations = mysqlRepository.findAll();
        
        // Save all data to Elasticsearch
        elasticRepository.saveAll(accommodations);
    }

    @Transactional
    public void syncSingleAccommodation(int id) {
        mysqlRepository.findById(id).ifPresent(accommodation -> {
            elasticRepository.save(accommodation);
        });
    }
} 