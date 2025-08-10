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
    @JoinColumn(name = "owner_id")
    private Owner owner;

    private Integer userId;

    @Convert(converter = MapToJsonConverter.class)
    @Column(columnDefinition = "TEXT")
    private Map<String,Object> extraData;


    public Houses(){}

    public Houses(
        String address,
        Double price,
        Owner owner,
        Integer userId,
        Map<String,Object> extraData
        )
    {
        this.address = address;
        this.price = price;
        this.owner = owner;
        this.userId = userId;
        this.extraData = extraData;
    }
}
