package restAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.useRelaxedHTTPSValidation;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GetSina {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class only run one time");
		
	}
	
	@Before
	public void before() {
		useRelaxedHTTPSValidation();
	}
	
	@Test
	public void getTencent() {
		given()
			.when()
			.get("https://www.sina.com").prettyPeek()
			.then()
			.statusCode(200);
	}
}
