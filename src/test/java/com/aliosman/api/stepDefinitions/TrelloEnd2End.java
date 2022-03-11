package com.aliosman.api.stepDefinitions;

import com.aliosman.api.pojos.BoardPojo;
import com.aliosman.utilities.ConfigReader;
import com.aliosman.utilities.ReadTxt;
import com.aliosman.utilities.WriteToText;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
/*
{
    "id": "622736e60c2d1e23f780c21f",
    "name": "board01",
    "desc": "",
    "descData": null,
    "closed": false,
    "idOrganization": "621d24453ce6193406961e85",
    "idEnterprise": null,
    "pinned": false,
    "url": "https://trello.com/b/ONTxduAQ/board01",
    "shortUrl": "https://trello.com/b/ONTxduAQ",
    "prefs": {
        "permissionLevel": "private",
        "hideVotes": false,
        "voting": "disabled",
        "comments": "members",
        "invitations": "members",
        "selfJoin": true,
        "cardCovers": true,
        "isTemplate": false,
        "cardAging": "regular",
        "calendarFeedEnabled": false,
        "hiddenPluginBoardButtons": [

        ],
        "background": "blue",
        "backgroundColor": "#0079BF",
        "backgroundImage": null,
        "backgroundImageScaled": null,
        "backgroundTile": false,
        "backgroundBrightness": "dark",
        "backgroundBottomColor": "#0079BF",
        "backgroundTopColor": "#0079BF",
        "canBePublic": true,
        "canBeEnterprise": true,
        "canBeOrg": true,
        "canBePrivate": true,
        "canInvite": true
    },
    "labelNames": {
        "green": "",
        "yellow": "",
        "orange": "",
        "red": "",
        "purple": "",
        "blue": "",
        "sky": "",
        "lime": "",
        "pink": "",
        "black": ""
    },
    "limits": {

    }
}
 */
public class TrelloEnd2End extends TestBaseApi {
    Response response;
    JsonPath jsonPath;
    BoardPojo boardPojo;
    //url tanımla ---- 'https://api.trello.com/1/boards/?name={name}'
    //expected data-request data
    // request gönder
    //resposu al
    //assert et
    @Given("tester creates a board named {string}")
    public void tester_creates_a_board_named(String boardName) throws JsonProcessingException {
        setUp();
        spec.pathParams("param1",1,"param2","boards");
        HashMap<String,String> requestBody = new HashMap<>();
        requestBody.put("name", boardName);
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token", ConfigReader.getProperty("token"));

        response= given()
                .spec(spec)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/{param1}/{param2}");

//        response.prettyPrint();
        jsonPath=response.jsonPath();

        ObjectMapper obj = new ObjectMapper();

        boardPojo = obj.readValue(response.asString(), BoardPojo.class);
        WriteToText.saveBoardResponseToFile("src/test/resources/testdata/Boards.txt",boardPojo);
        System.out.println("file created");
    }
    @Given("Assert status code {int}")
    public void assert_status_code(Integer expectedStatusCode) {
        Assert.assertTrue("something wrong with request",response.getStatusCode()==expectedStatusCode);


    }
    @Then("Assert board name is {string}")
    public void assert_board_name_is(String expectedBoardName) {
        Assert.assertEquals(expectedBoardName,jsonPath.get("name"));
        System.out.println(ReadTxt.returnBoardId("src/test/resources/testdata/Boards.txt",expectedBoardName));
        System.out.println("aaaaaaaaa");
    }


}
