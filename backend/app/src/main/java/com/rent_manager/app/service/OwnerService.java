package com.rent_manager.app.service;

import com.rent_manager.app.model.Owner;
import com.rent_manager.app.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    @Autowired
    OwnerRepository ownerRepository;

    public Owner findById(Long id){
        return ownerRepository.findById(id).orElse(null);
    }

}
