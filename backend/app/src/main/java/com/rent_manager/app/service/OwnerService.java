package com.rent_manager.app.service;

import com.rent_manager.app.dto.OwnerDTO;
import com.rent_manager.app.model.Owner;
import com.rent_manager.app.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {

    @Autowired
    OwnerRepository ownerRepository;

    public Owner findById(Long id){
        return ownerRepository.findById(id).orElse(null);
    }

    public Optional<Owner> findByEmail(String email) {
        return ownerRepository.findByEmail(email);
    }

    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    public List<Owner> getOwnerList() {
        return ownerRepository.findAll();
    }
}
