package com.rent_manager.app.dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
public class HouseDTO {
    private String address;
    private Double price;
    private Long ownerId;
    private Integer userId;

    private Integer numberOfRooms;

    private Integer numberOfBaths;

    private Integer maxOccupancy;

    private Boolean isGoodForKids;

    private Boolean hasParkingSpot;

    private Double areaM2;



    //region - getters
    public String getAddress(){
        return address;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public Integer getNumberOfBaths() {
        return numberOfBaths;
    }

    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }


    public Boolean getGoodForKids() {
        return isGoodForKids;
    }

    public Boolean getHasParkingSpot() {
        return hasParkingSpot;
    }

    public Double getAreaM2() {
        return areaM2;
    }

    public Double getPrice(){
        return price;
    }

    public Long getOwnerId(){
        return ownerId;
    }

    public Integer getUserId(){
        return userId;
    }


    //endregion

    //region - Setters

    public void setAddress(String address){
        this.address = address;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setOwnerId(Long ownerId){
        this.ownerId = ownerId;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public void setAreaM2(Double areaM2) {
        this.areaM2 = areaM2;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setNumberOfBaths(Integer numberOfBaths) {
        this.numberOfBaths = numberOfBaths;
    }

    public void setMaxOccupancy(Integer maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public void setGoodForKids(Boolean goodForKids) {
        isGoodForKids = goodForKids;
    }

    public void setHasParkingSpot(Boolean hasParkingSpot) {
        this.hasParkingSpot = hasParkingSpot;
    }

    //endregion


}
