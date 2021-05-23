package ValidationPackage;

import io.restassured.path.json.JsonPath;

public class parsingJsonResponse {
	
	public static String parseRespone(String response, String parsedValue)
	{
		JsonPath js = new JsonPath(response);
		String placeId = js.getString(parsedValue);
		return placeId;
		
	}

}
