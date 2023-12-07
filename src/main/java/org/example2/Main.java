package org.example2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("milk");
        shoppingList.add("coffee");
        shoppingList.add("bread");

        String jsonString = mapper.writeValueAsString(shoppingList);

        System.out.println(jsonString);


    }


}
