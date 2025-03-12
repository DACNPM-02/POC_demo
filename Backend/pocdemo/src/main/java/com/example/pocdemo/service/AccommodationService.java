package com.example.pocdemo.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pocdemo.model.Accommodation;
import com.example.pocdemo.repository.AccommodationRepository;

@Service
public class AccommodationService {
    private final AccommodationRepository repository;
    private final GeocodingService geocodingService;

    @Autowired
    public AccommodationService(AccommodationRepository repo, GeocodingService geocodingService) {
        this.repository = repo;
        this.geocodingService=geocodingService;
    }

    public List<Accommodation> getAllAccommodations() {
        List<Accommodation> result = repository.findAll();
        System.out.println(result.size());
        return result;
    }

    public List<Accommodation> searchAccomodations(String address, double radius, int limit) {
        double[] location = geocodingService.getLatLngFromAddress(address);
        double lat = location[0];
        double lng = location[1];
        System.out.println("location: "+location);
        System.out.println("lattitude: "+lat);
        System.out.println("lengtitude: "+lng);
        
        if (lat == 0 && lng == 0) {
            throw new RuntimeException("khong lay duoc api ket");
        }
        
        List<Accommodation> accommodations = repository.findNearbyAccommodations(lat, lng, radius, limit);
        return accommodations != null ? accommodations : Collections.emptyList();
    }


    public Accommodation createAccommodation(Accommodation accommodation) {
        return repository.save(accommodation);
    }

}
