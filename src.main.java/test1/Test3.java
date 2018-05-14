package test1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;

public class Test3 {
	@BeforeClass
	public static void setUp() {
		useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://testerhome.com";
		RestAssured.proxy("127.0.0.1",8080);
	}
	
	@Test
	public void testTesterHomeJsonGlobal() {
		given().when().get("/api/v3/topics/10254.json").prettyPeek()
		.then()
		.statusCode(200)
		.body("topic.title", equalTo("优质招聘汇总"))
		;
	}
	
	@Test
	public void testJsonPart() {
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("id", 6040);
		map.put("title", "通过代理安装 appium");
		map.put("name", "思寒");
		
		HashMap<String,Object> root = new HashMap<String,Object>();
		root.put("topic", map);
		
		given().contentType(ContentType.JSON)
		.body(root).when()
		.post("http://www.baidu.com").prettyPeek()
		.then().time(lessThan(1000L))
//		.statusCode(200)
		;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
