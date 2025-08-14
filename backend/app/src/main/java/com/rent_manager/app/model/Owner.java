package com.rent_manager.app.model;


import com.rent_manager.app.dto.OwnerDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.id.factory.spi.GenerationTypeStrategy;

import java.util.List;

@Entity
@Getter
@Setter
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String email;
    private String phone;
    private Boolean isAgency;

    @OneToMany(mappedBy = "owner")
    private List<Houses> housesList;


    public Owner(){}

    public Owner(String name,String email, String phone, Boolean isAgency){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.isAgency = isAgency;
    }


    public Owner(OwnerDTO ownerDTO){
        this.setName(ownerDTO.getName());
        this.setPhone(ownerDTO.getPhone());
        this.setAgency(ownerDTO.getAgency());
        this.setEmail(ownerDTO.getEmail());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getAgency() {
        return isAgency;
    }

    public void setAgency(Boolean agency) {
        isAgency = agency;
    }

    public List<Houses> getHousesList() {
        return housesList;
    }

    public void setHousesList(List<Houses> housesList) {
        this.housesList = housesList;
    }
}
