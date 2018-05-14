package restAssured;

import static io.restassured.RestAssured.useRelaxedHTTPSValidation;
import static io.restassured.RestAssured.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GetTencent {
	
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
			.get("https://www.qq.com").prettyPeek()
			.then()
			.statusCode(200);
	}

}
