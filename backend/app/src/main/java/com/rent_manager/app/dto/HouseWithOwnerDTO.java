package com.rent_manager.app.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class HouseWithOwnerDTO {

    private HouseDTO houseDto;
    private OwnerDTO ownerDto;

    public void setHouseDto(HouseDTO houseDto){
        this.houseDto = houseDto;
    }

    public void setOwnerDto(OwnerDTO ownerDto){
        this.ownerDto = ownerDto;
    }

    public HouseDTO getHouseDto(){return this.houseDto;}

    public OwnerDTO getOwnerDto() {
        return ownerDto;
    }
}
