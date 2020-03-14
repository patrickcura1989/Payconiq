package com.example.test;

import com.jayway.restassured.RestAssured;

public class UnitTestBase {

  protected String accessToken = System.getenv("accessToken");

  public UnitTestBase() {
    RestAssured.baseURI = "https://api.github.com";
  }
}
