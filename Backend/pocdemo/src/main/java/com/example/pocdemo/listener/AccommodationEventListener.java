package com.example.pocdemo.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.pocdemo.model.Accommodation;
import com.example.pocdemo.repository.elastic.AccommodationElasticRepository;

import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;

@Component
public class AccommodationEventListener {

    private static AccommodationElasticRepository elasticRepository;

    @Autowired
    public void setElasticRepository(AccommodationElasticRepository elasticRepository) {
        AccommodationEventListener.elasticRepository = elasticRepository;
    }

    @PostPersist
    public void onPostPersist(Accommodation accommodation) {
        elasticRepository.save(accommodation);
    }

    @PostUpdate
    public void onPostUpdate(Accommodation accommodation) {
        elasticRepository.save(accommodation);
    }

    @PostRemove
    public void onPostRemove(Accommodation accommodation) {
        elasticRepository.delete(accommodation);
    }
} 