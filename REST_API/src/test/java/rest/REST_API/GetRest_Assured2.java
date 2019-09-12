package rest.REST_API;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetRest_Assured2 {
	
	@Test(priority=1)
	public void getRestCall(){
		int statuscode = 
				get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();
		
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
		if(statuscode==200){
			System.out.println("My test case pass");
		}
	}
	
	@Test(priority=2)
	public void getRestCall_(){
		String statuscode_String = 
				get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
		long time =get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
		
		
		System.out.println(statuscode_String);
        System.out.println("Response Time -- > " + time);
	}

}
