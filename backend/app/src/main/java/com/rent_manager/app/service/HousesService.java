package com.rent_manager.app.service;


import com.rent_manager.app.model.Houses;
import com.rent_manager.app.repository.HousesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HousesService {

    //region - Autowired

    @Autowired
    HousesRepository housesRepository;

    //endregion


    public List<Houses> getHouses(){
        return housesRepository.findAll();
    }

    public void saveHouse(Houses addHouse) {
        housesRepository.save(addHouse);
    }

    public void deleteById(Long id) {
        housesRepository.deleteById(id);
    }

    public Houses findHouseById(Long id){
        return housesRepository.findById(id)
                .orElse(null);
    }
}
