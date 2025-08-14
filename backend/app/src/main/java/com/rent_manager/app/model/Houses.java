package com.rent_manager.app.model;


import com.rent_manager.app.model.converter.MapToJsonConverter;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Houses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    private Double price;


    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

    private Integer userId;

    // -- Opcionales --

    private Integer numberOfRooms = null;

    private Integer numberOfBaths;

    private Integer maxOccupancy;

    private Boolean isGoodForKids;

    private Boolean hasParkingSpot;

    private Double areaM2;



    public Houses(){}

    public Houses(
        String address,
        Double price,
        Owner owner,
        Integer userId
        )
    {
        this(
                address,
                price,
                owner,
                userId,
                null,
                null,
                null,
                false,
                false,
                null
        );
    }

    public Houses(
            String address,
            Double price,
            Owner owner,
            Integer userId,
            Integer numberOfRooms,
            Integer numberOfBaths,
            Integer maxOccupancy,
            Boolean isGoodForKids,
            Boolean hasParkingSpot,
            Double areaM2
    )
    {
        this.address = address;
        this.price = price;
        this.owner = owner;
        this.userId = userId;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBaths = numberOfBaths;
        this.maxOccupancy = maxOccupancy;
        this.isGoodForKids = isGoodForKids;
        this.hasParkingSpot = hasParkingSpot;
        this.areaM2 = areaM2;
    }


    // Getters & Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Integer getNumberOfBaths() {
        return numberOfBaths;
    }

    public void setNumberOfBaths(Integer numberOfBaths) {
        this.numberOfBaths = numberOfBaths;
    }

    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(Integer maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public Boolean getGoodForKids() {
        return isGoodForKids;
    }

    public void setGoodForKids(Boolean goodForKids) {
        isGoodForKids = goodForKids;
    }

    public Boolean getHasParkingSpot() {
        return hasParkingSpot;
    }

    public void setHasParkingSpot(Boolean hasParkingSpot) {
        this.hasParkingSpot = hasParkingSpot;
    }

    public Double getAreaM2() {
        return areaM2;
    }

    public void setAreaM2(Double areaM2) {
        this.areaM2 = areaM2;
    }
}
