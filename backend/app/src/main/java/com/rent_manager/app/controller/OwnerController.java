package com.rent_manager.app.controller;


import com.rent_manager.app.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.base.path}/owner")
public class OwnerController {

    //region Autowired

    @Autowired
    OwnerService ownerService;
    //endregion

    @GetMapping("/listOwners")
    public ResponseEntity<?> getOwnerList(){
        try{
            var ownerList = ownerService.getOwnerList();

            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(ownerList);

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Ocurrio un error al manejar la solicitud.");
        }
    }
}
