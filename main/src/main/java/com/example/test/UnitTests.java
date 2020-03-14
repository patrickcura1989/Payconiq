package com.example.test;

import static com.jayway.restassured.RestAssured.given;

import com.example.models.post.Files;
import com.example.models.post.PostGist;
import com.example.models.post.Simplefile;
import com.example.models.response.Gist;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jayway.restassured.response.Response;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class UnitTests extends UnitTestBase {

  @Test
  public void test1() {
    Gson gson = new Gson();
    Response response;

    Files files = new Files();
    files.withSimplefile(new Simplefile().withContent("class HelloWorld"));

    PostGist postGist =
        new PostGist()
            .withDescription("Hello World Examples")
            .withPublic(true)
            .withFiles(
                new Files().withSimplefile(new Simplefile().withContent("class HelloWorld")));

    response = given().auth().oauth2(accessToken).body(gson.toJson(postGist)).post("/gists");

    response.then().log().all(true).statusCode(201);

    Gist gist = gson.fromJson(response.getBody().asString(), Gist.class);

    response = given().auth().oauth2(accessToken).when().get("/gists");

    response.then().log().all(true).statusCode(200);

    Type listType = new TypeToken<ArrayList<Gist>>() {}.getType();

    List<Gist> gists = gson.fromJson(response.getBody().asString(), listType);

    for (int i = 0; i < gists.size(); i++) {
      response = given().auth().oauth2(accessToken).when().delete("/gists/" + gists.get(i).getId());
      response.then().log().all(true).statusCode(204);
    }
  }
}
