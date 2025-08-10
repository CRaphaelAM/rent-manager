package com.rent_manager.app.controller;


import com.rent_manager.app.dto.HouseDto;
import com.rent_manager.app.model.Houses;
import com.rent_manager.app.model.Owner;
import com.rent_manager.app.service.HousesService;
import com.rent_manager.app.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("${api.base.path}/houses")
public class HousesController {

    //region - Autowired
    @Autowired
    HousesService housesService;

    @Autowired
    OwnerService ownerService;
    //endregion

    @GetMapping("/listHouses")
    public List<Houses> getHouses(){
        return housesService.getHouses();
    }

    @PostMapping("/addHouse")
    public ResponseEntity<String> addHouse(@RequestBody HouseDto houseDto ){
        try{

            // Recuperar el propietario a partir de su id
            Owner owner = ownerService.findById(houseDto.getOwnerId());

            if (owner == null)
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .build();

            Houses house = new Houses(
                houseDto.getAddress(),
                houseDto.getPrice(),
                owner,
                houseDto.getUserId(),
                houseDto.getExtraData()
            );

            housesService.saveHouse(house);

            return ResponseEntity.ok("Agregada con éxito");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al agregar");
        }
    }


    @DeleteMapping("deleteHouse/{id}")
    public ResponseEntity<?> deleteHouse(@PathVariable Long id){
        try{
            housesService.deleteById(id);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(e.getMessage());
        }
    }

    @GetMapping("getHouse/{id}")
    public ResponseEntity<?> getHouse(@PathVariable Long id){

        // House | null
        var house = housesService.findHouseById(id);

        if (house == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(house);
    }
}
