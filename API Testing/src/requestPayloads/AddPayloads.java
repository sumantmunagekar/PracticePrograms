package requestPayloads;

public class AddPayloads {
	
	public static String createPlaceId()
	{
		return "{\n"
				+ "  \"location\": {\n"
				+ "    \"lat\": -38.383494,\n"
				+ "    \"lng\": 33.427362\n"
				+ "  },\n"
				+ "  \"accuracy\": 50,\n"
				+ "  \"name\": \"Frontline house\",\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\n"
				+ "  \"types\": [\n"
				+ "    \"shoe park\",\n"
				+ "    \"shop\"\n"
				+ "  ],\n"
				+ "  \"website\": \"http://google.com\",\n"
				+ "  \"language\": \"French-IN\"\n"
				+ "}";
	}
	
	public static String updateAddress(String addressPlaceId, String updatedAddress)
	{
		String updateRequestbody = "{\n"
				+ "\"place_id\":\""+addressPlaceId+"\",\n"
				+ "\"address\":\""+updatedAddress+"\",\n"
				+ "\"key\":\"qaclick123\"\n"
				+ "}";
		return updateRequestbody;
	}

}
