package example.test;

import static com.jayway.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jayway.restassured.response.Response;
import example.models.post.Files;
import example.models.post.PostGist;
import example.models.post.Simplefile;
import example.models.response.Gist;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Tests extends TestBase {

  @Test
  public void givenValidInputsWhenPostGistsThenReturn201() {
    Gson gson = new Gson();
    Response response;

    String description = "Hello World Examples";
    String content = "class HelloWorld";

    // Do a post request to gists
    PostGist postGist =
        new PostGist()
            .withDescription(description)
            .withPublic(true)
            .withFiles(new Files().withSimplefile(new Simplefile().withContent(content)));
    response = given().auth().oauth2(accessToken).body(gson.toJson(postGist)).post("/gists");
    response.then().log().all(true).statusCode(201);

    Gist gist = gson.fromJson(response.getBody().asString(), Gist.class);
    assertEquals(gist.getDescription(), description);
    assertEquals(gist.getFiles().getSimplefile().getContent(), content);

    // Do a cleanup
    removeGist(gist);
    // removeAllGists();
  }

  private void removeGist(Gist gist) {
    Gson gson = new Gson();
    Response response;

    response = given().auth().oauth2(accessToken).when().delete("/gists/" + gist.getId());
    response.then().log().all(true).statusCode(204);
  }

  private void removeAllGists() {
    Gson gson = new Gson();
    Response response;

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
