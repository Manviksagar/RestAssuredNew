package com.sag.tests;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.testng.annotations.Test;

public class JsonserverTest {



    @Test
    public void getCheck(){
        baseURI="http://localhost:3000";

         given().get("/posts").then().statusCode(200).log().all();
    }
}
