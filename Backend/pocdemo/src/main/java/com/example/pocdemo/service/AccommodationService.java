package com.example.pocdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pocdemo.model.Accommodation;
import com.example.pocdemo.repository.AccommodationRepository;

@Service
public class AccommodationService {
    private final AccommodationRepository repository;

    public AccommodationService(AccommodationRepository repo) {
        this.repository = repo;
    }

    public List<Accommodation> getAllAccommodations() {
        List<Accommodation> result = repository.findAll();
        System.out.println(result.size());
        return result;
    }

    public Accommodation createAccommodation(Accommodation accommodation) {
        return repository.save(accommodation);
    }

}
