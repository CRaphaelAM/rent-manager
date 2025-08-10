package com.rent_manager.app;


import com.rent_manager.app.model.converter.MapToJsonConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest

public class testMapToJsonConverter {

    @Test
    public void mainFunction(){
        final String json = "{\"datoA\":\"1\", \"datoB\":\"5\"}";
        final String emptyJson = "";
        final Map<String,Object> mapToString = new HashMap<>();
        final Map<String,Object> emptyMapToString = new HashMap<>();

        mapToString.put("dato1","Este es el valor del dato1");
        mapToString.put("dato2","Este es el valor del dato2");

        var converter = new MapToJsonConverter();

        var fromString = converter.convertToEntityAttribute(json);
        var emptyFromString = converter.convertToEntityAttribute(emptyJson);

        var fromMap = converter.convertToDatabaseColumn(mapToString);
        var emptyfromMap = converter.convertToDatabaseColumn(emptyMapToString);

        System.out.println(fromString);
    }
}
