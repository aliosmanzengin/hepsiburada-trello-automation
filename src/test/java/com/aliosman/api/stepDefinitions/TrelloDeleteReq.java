package com.aliosman.api.stepDefinitions;

import com.aliosman.api.pojos.BoardPojo;
import com.aliosman.utilities.ConfigReader;
import com.aliosman.utilities.ReadTxt;
import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TrelloDeleteReq extends TestBaseApi {

    Response response;
    JsonPath jsonPath;
    BoardPojo boardPojo;
//-url 'https://api.trello.com/1/boards/{id}'
    @Given("tester deletes all booards named {string}")
    public void testerDeletesAllBooardsNamed(String boardName) {
        String boardId = ReadTxt.returnBoardId(boardName);
        setUp();
        spec.pathParams("param1",1,"param2","boards","param3",boardId);
        HashMap<String,String> requestBody = new HashMap<>();
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token", ConfigReader.getProperty("token"));
        response = given()
                .spec(spec)
                .contentType("application/json")
                .body(requestBody)
                .when()
                .delete("/{param1}/{param2}/{param3}");

        System.out.println("response.getStatusCode() = " + response.getStatusCode());
    }

}
