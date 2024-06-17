package definitions;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class CareerStepDefs {
    @Given("I verify GET request for {string}")
    public void iVerifyGETRequestFor(String endpoint) {

        ValidatableResponse response = RestAssured.given()
                .baseUri("https://skryabin.com/recruit/api/v1")
                .when()
                .get(endpoint)
                .then()
                .log().all()
                .statusCode(200);

        System.out.println(response);
    }
}
