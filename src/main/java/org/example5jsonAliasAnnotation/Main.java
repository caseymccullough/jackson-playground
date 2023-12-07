package org.example5jsonAliasAnnotation;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        String jsonString = "{\"countryOfOrigin\" : \"Brazil\", \"color\":\"yellow\", \"quantity\": 20}";

        ObjectMapper mapper = new ObjectMapper();
        //Banana banana = mapper.readValue(jsonString, Banana.class);

        //System.out.println(car);

    }

}

class Banana {
    public String countryOfOrigin;
    public String color;

    public int quantity;
    public boolean inSeason;

    @Override
    public String toString() {
        return "Banana{" +
                "countryOfOrigin='" + countryOfOrigin + '\'' +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                ", inSeason=" + inSeason +
                '}';
    }
}

class Car {
    // map this field to the json key-value pair that has
    // "brand", "brandName", "brand_name", or "myBrandName"
    @JsonAlias({"brandName", "brand_name", "myBrandName"})
    public String brand;

    // map this field to the json key-value pair that has
    // "type" or "model"
    @JsonAlias({"type"})
    public String model;
    public String color;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


