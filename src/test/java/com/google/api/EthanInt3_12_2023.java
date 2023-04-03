package com.google.api;

import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


//import static org.junit.jupiter.api.Assertions.assertEquals;

public class EthanInt3_12_2023 {


//
    @BeforeAll
    public static void init(){
        RestAssured.baseURI="https://api.coingecko.com";
    }
//
//    @DisplayName("Take all info")
    @Test
    public void test1() {

        Response response = RestAssured
                .given().accept(ContentType.JSON).when().get("/api/v3/exchange_rates");

        //Then status code is 200

        response.prettyPrint();
        assertEquals(200,response.statusCode());

        //And Content - Type is application/json

        assertEquals("application/json; charset=utf-8",response.contentType());
        assertEquals("application/json; charset=utf-8",response.header("Content-Type"));

        assertEquals(ContentType.JSON.toString(),response.header("Content-Type"));

        //And response contains United States of America

        assertTrue(response.body().asString().contains("United States of America"));

    }
//
 //   @DisplayName("Take all info")
    @Test
    public void test2() {
        Map<String, Object> payload = new HashMap<>();
        payload.put("name", "Bitcoin");
        payload.put("symbol", "BTC");
        payload.put("price", 55000);

        // Send POST request with payload
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(payload)
                .post("/api/v3/exchange_rates");

        // Print response status code and body
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
    }
}
