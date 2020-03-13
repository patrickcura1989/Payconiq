package com.example.main;

import org.junit.jupiter.api.Test;
import static com.jayway.restassured.RestAssured.given;

public class UnitTests {

    @Test
    public void test1() {
        given().when().get("https://api.github.com/gists/52306047949e07f9fa682c5194d72f4c").then().statusCode(200);
    }

}
