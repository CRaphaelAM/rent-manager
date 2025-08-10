package com.rent_manager.app.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
public class HouseDto {
    private String address;
    private Double price;
    private Long ownerId;
    private Integer userId;
    private Map<String,Object> extraData;


    //region - getters
    public String getAddress(){
        return address;
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

    public Map<String,Object> getExtraData(){
        return extraData;
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

    public void setExtraData(Map<String,Object> extraData){
        this.extraData = extraData;
    }
    //endregion


}
