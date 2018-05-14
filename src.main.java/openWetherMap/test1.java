package openWetherMap;

import static io.restassured.RestAssured.useRelaxedHTTPSValidation;

import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import junit.framework.Assert;

public class test1 {
	@BeforeClass
	public static void setUp() {
		useRelaxedHTTPSValidation();	
	}
	
	@Test
	public void getDataWether() {
		get("https://samples.openweathermap.org/data/2.5/group?id=524901,703448,2643743&units=metric&appid=b6907d289e10d714a6e88b30761fae22").prettyPeek();
		
	}
	
	@Test
	public void testResponseTime() {
		
		Response resp = get("https://samples.openweathermap.org/data/2.5/group?id=524901,703448,2643743&units=metric&appid=b6907d289e10d714a6e88b30761fae22");

		int code = resp.getStatusCode();
		
		System.out.println("Status code is: " + code);
		
	}
	
	@Test
	public void testBody() {
		Response resp = get("https://samples.openweathermap.org/data/2.5/group?id=524901,703448,2643743&units=metric&appid=b6907d289e10d714a6e88b30761fae22");
		String data = resp.asString();
		
		System.out.println("Data is: " + data);
		
		System.out.println("The response time is:  " + resp.getTime());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
