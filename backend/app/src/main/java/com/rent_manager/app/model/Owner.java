package com.rent_manager.app.model;


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

}
