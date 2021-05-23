import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import requestPayloads.AddPayloads;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import ValidationPackage.parsingJsonResponse;

import static io.restassured.RestAssured.*;

public class SampleAPITesting {

	public static void main(String[] args) {

		// given-->all the input details
		// when-->Submit the API --?resource, API method will be done provided in when
		// then-->validate the response

		// try out below scenario
		// Add a place-->Update the place id-->Get the place ID and validate if the
		// updated one is correct or not

		// Creating/adding a place

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String createPlaceResponse = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(AddPayloads.createPlaceId()).when().post("maps/api/place/add/json").then().log().all()
				.assertThat().statusCode(200).body("scope", equalTo("APP"))
				.header("Access-Control-Allow-Methods", "POST").extract().response().asString();
		
		String placeId = parsingJsonResponse.parseRespone(createPlaceResponse, "place_id");
		
		//JsonPath js = new JsonPath(createPlaceResponse);
		//String placeId = js.getString("place_id");
		
		//get the address which is added to the place id
		/*String responseBeforeAddUpdate = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.when().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath jsBeforeUpdt = new JsonPath(responseBeforeAddUpdate);
		String oldAddress = jsBeforeUpdt.getString("address");*/
		
		
		//Update the address of the place id
		String updatedAddress = "70 winter walk, USA";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
								.body(AddPayloads.updateAddress(placeId, updatedAddress)).when().put("/maps/api/place/update/json").then().log().all()
								.assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		
		//Validating if the address is updated or not by firing a GET request
		String responseAfterUpdate = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId).header("Content-Type", "application/json")
		.when().get("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		//JsonPath jsAfterUpdt = new JsonPath(responseAfterUpdate);
		String newAddress = parsingJsonResponse.parseRespone(responseAfterUpdate ,"address");
	
		Assert.assertEquals(newAddress, updatedAddress, "Address not updated");
		

	}

}
