package example.test;


import io.restassured.RestAssured;

public class TestBase {

  protected String accessToken = System.getenv("accessToken");

  public TestBase() {
    RestAssured.baseURI = "https://api.github.com";
  }
}
