package com.example.pocdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accommodation")
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String short_description;
    private String description;
    private String address;
    private double location_lat;
    private double location_lng;
    private String cover_img_src;
    private int price;
    private int num_of_bedroom;
    private int num_of_bed;
    private int max_guests;

    public Accommodation() {
        // default constructor
    }

    public Accommodation(int id, String title, String short_desc, String desc, String addr, double latitude,
            double longitude, int price, int bedroom, int bed, int guests, String cover_img) {
        this.id = id;
        this.title = title;
        this.short_description = short_desc;
        this.description = desc;
        this.address = addr;
        this.location_lat = latitude;
        this.location_lng = longitude;
        this.price = price;
        this.num_of_bedroom = bedroom;
        this.max_guests = guests;
        this.num_of_bed = bed;
        this.cover_img_src = cover_img;
    }
    /* GETTER */

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getShortDescription() {
        return this.short_description;
    }

    public String getDescription() {
        return this.description;
    }

    public int getNumberOfBed() {
        return this.num_of_bed;
    }

    public int getNumberOfBedroom() {
        return this.num_of_bedroom;
    }

    public int getMaxGuests() {
        return this.max_guests;
    }

    public int getPrice() {
        return this.price;
    }

    public String getCoverImgSrc() {
        return this.cover_img_src;
    }

    public double getLatitude() {
        return this.location_lat;
    }

    public String getAddress() {
        return this.address;
    }

    public double getLogitude() {
        return this.location_lng;
    }

    /* SETTER */
    public void setLongitude(double value) {
        this.location_lng = value;
    }

    public void setLatitude(double value) {
        this.location_lat = value;
    }

    public void setAddress(String addr) {
        this.address = addr;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setShortDescription(String short_desc) {
        this.short_description = short_desc;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public void setCoverImg(String src) {
        this.cover_img_src = src;
    }

    public void setNumberOfBedroom(int number) {
        this.num_of_bedroom = number;
    }

    public void setNumberOfRoom(int number) {
        this.num_of_bed = number;
    }

    public void setMaxGuests(int number) {
        this.max_guests = number;
    }

}
