package com.example.pocdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pocdemo.service.DataSyncService;

@RestController
@RequestMapping("/api/sync")
public class DataSyncController {

    private final DataSyncService dataSyncService;

    @Autowired
    public DataSyncController(DataSyncService dataSyncService) {
        this.dataSyncService = dataSyncService;
    }

    @PostMapping("/all")
    public String syncAllData() {
        dataSyncService.syncAllData();
        return "Data synchronization completed successfully";
    }

    @PostMapping("/single")
    public String syncSingleAccommodation(@RequestParam int id) {
        dataSyncService.syncSingleAccommodation(id);
        return "Accommodation with ID " + id + " synchronized successfully";
    }
} 