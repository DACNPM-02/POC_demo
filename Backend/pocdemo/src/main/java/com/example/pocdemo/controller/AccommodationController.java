package com.example.pocdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.pocdemo.model.Accommodation;
import com.example.pocdemo.service.AccommodationService;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class AccommodationController {
    private AccommodationService accommodationService;

    @Autowired
    public AccommodationController(AccommodationService service) {
        this.accommodationService = service;
    }

    @GetMapping("/accommodations")
    public List<Accommodation> getAllProduct() {
        System.out.println("get all accommodations");
        return accommodationService.getAllAccommodations();
    }
    @GetMapping("/accommodations/search")
    public List<Accommodation> searchAccommodations(
            @RequestParam String address,
            @RequestParam(defaultValue="10") double radius,
            @RequestParam(defaultValue="10") int limit
    ){
        return accommodationService.searchAccomodations(address,radius,limit);
    }

}