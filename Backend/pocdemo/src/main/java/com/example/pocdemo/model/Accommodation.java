package com.example.pocdemo.model;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.example.pocdemo.listener.AccommodationEventListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accommodation")
@Document(indexName = "accommodations")
@EntityListeners(AccommodationEventListener.class)
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Field(type = FieldType.Text)
    private String title;
    
    @Column(name = "short_description")
    @Field(type = FieldType.Text)
    private String shortDescription;
    
    @Field(type = FieldType.Text)
    private String description;
    
    @Field(type = FieldType.Text)
    private String address;
    
    @Column(name = "location_lat")
    @Field(type = FieldType.Double)
    private double latitude;
    
    @Column(name = "location_lng")
    @Field(type = FieldType.Double)
    private double logitude;
    
    @Column(name = "cover_img_src")
    @Field(type = FieldType.Text)
    private String coverImgSrc;
    
    @Field(type = FieldType.Integer)
    private int price;
    
    @Column(name = "number_of_bedroom")
    @Field(type = FieldType.Integer)
    private int numberOfBedroom;
    
    @Column(name = "number_of_bed")
    @Field(type = FieldType.Integer)
    private int numberOfBed;
    
    @Column(name = "max_guests")
    @Field(type = FieldType.Integer)
    private int maxGuests;

    public Accommodation() {
        // default constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLogitude() {
        return logitude;
    }

    public void setLogitude(double logitude) {
        this.logitude = logitude;
    }

    public String getCoverImgSrc() {
        return coverImgSrc;
    }

    public void setCoverImgSrc(String coverImgSrc) {
        this.coverImgSrc = coverImgSrc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfBedroom() {
        return numberOfBedroom;
    }

    public void setNumberOfBedroom(int numberOfBedroom) {
        this.numberOfBedroom = numberOfBedroom;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }
}
