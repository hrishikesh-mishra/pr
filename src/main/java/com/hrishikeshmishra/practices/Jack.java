package com.hrishikeshmishra.practices;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

public class Jack {

    public static void main(String[] args) throws IOException {
        readTree();
    }

    public static void readTree() throws IOException {
        String json = "{\"a\":2, \"b\":\"a string\", \"c\": [6.7, 6, 5.6, 8.0]}";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(json);

        if (node.isObject()) {
            ObjectNode obj = (ObjectNode) node ;
            System.out.printf(obj.toString());
        }
    }

    public static void simpleModule (){

    }
}
