package com.aliosman.api.stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

public class TrelloDemoStepDefinitions extends TestBaseApi{
    //set the url
    //expected data - request data
    //send request
    //take response
    //assert
    Response response;
    @Given("Send POST request for create {string} board")
    public void send_post_request_for_create_board(String boardName) {
//        String url= "https://api.trello.com/1/boards/?name=aliosman&key=5f2fb37479f680307101f818e02d3979&token=c20d888d64bd69034153aa28fea99ca3a3aa09a2a1ede042e32a75158af87f1f";
//        setUp();
//        spec.pathParams(  "param1",1, "param2", "boards");
//
//        HashMap<String,String> requestBody = new HashMap<>();
//        requestBody.put("name",boardName);
//        requestBody.put("key","5f2fb37479f680307101f818e02d3979");
//        requestBody.put("token","c20d888d64bd69034153aa28fea99ca3a3aa09a2a1ede042e32a75158af87f1f");
//        response =given().spec(spec)
//                .contentType(ContentType.JSON)
//                .body(requestBody)
//                .
//                .response();

    }

}
