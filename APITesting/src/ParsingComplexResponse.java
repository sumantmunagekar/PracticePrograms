import MockupFiles.MockupResponse;
import io.restassured.path.json.JsonPath;

public class ParsingComplexResponse {
	
	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(MockupResponse.MockedUpResponse());
		
		//to get the size of JArray length
		//1. Print No of courses returned by API
		int arraySize = js.getInt("courses.size()");
		int totalCost=0;
		
		System.out.println("No of Courses: "+arraySize);
		
		//2. Print the purchase Amount
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		
		System.out.println("purchase Amount: "+purchaseAmount);
		
		//3. Print Title of the first course
		String CourseOneTitle = js.getString("courses[0].title");
		System.out.println("Course 1 Title: "+CourseOneTitle);
		
		//4. Print All course titles and their respective Prices
		for(int i=0;i<arraySize; i++)
		{
			System.out.println("The price of the course, "+js.getString("courses["+i+"].title")+" is "+js.getInt("courses["+i+"].price"));
		}
		
		//5. Print no of copies sold by RPA Course
		for(int i=0;i<arraySize; i++)
		{
			
			if(js.getString("courses["+i+"].title").equalsIgnoreCase("RPA"))
			{
				System.out.println("Copies sold for "+js.getString("courses["+i+"].title")+" is "+js.getInt("courses["+i+"].copies"));
			}
			
		}
		
		//6. Verify if Sum of all Course prices matches with Purchase Amount
		for(int i=0; i<arraySize;i++)
		{
			totalCost = totalCost + (js.getInt("courses["+i+"].price") * js.getInt("courses["+i+"].copies"));
		}
		
		System.out.println("Total Cost: "+totalCost);
		
		
		if(purchaseAmount==totalCost)
		{
			System.out.println("Total Cost is equal to the purchased amount");
		}
		else
			System.out.println("There is a discrepancy between the total cost and the purchased amount");
		
	}

}
