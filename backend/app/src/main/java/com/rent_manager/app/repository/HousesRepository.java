package com.rent_manager.app.repository;


import com.rent_manager.app.model.Houses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HousesRepository extends JpaRepository<Houses,Long> {

}
