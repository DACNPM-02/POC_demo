package com.example.pocdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.pocdemo.model.Accommodation;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Integer> {

}