package com.rent_manager.app.model.converter;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Map;

@Converter
public class MapToJsonConverter implements AttributeConverter<Map<String,Object>,String>{

    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Map<String, Object> attribute) {
        try{
            if (attribute == null || attribute.isEmpty()) return "";

            return objectMapper.writeValueAsString(attribute);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("No se pudo realizar la conversión a cadena",e);
        }
    }

    @Override
    public Map<String, Object> convertToEntityAttribute(String dbData) {
        try{
            if (dbData == null || dbData.isBlank()) return Map.of();
            return objectMapper.readValue(dbData,Map.class);
        }catch (IOException | IllegalArgumentException error){
            throw new RuntimeException("No se pudo realizar la conversión a mapa",error);
        }


    }
}
