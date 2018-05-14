package test1;


import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class test2 {
	@BeforeClass
	public static void setUp(){
		useRelaxedHTTPSValidation();
	}
	
	@Test
	public void testHtml() {
		given().queryParam("q", "appium")
			.when().get("https://testerhome.com/search").prettyPeek()
			.then().statusCode(200)
			.body("html.head.title", equalTo("appium"))
			;
	}
	
	@Test
	public void testhomeHTML() {
		given().when().get("https://testerhome.com/api/v3/topics.json").prettyPeek()
		.then()
		.statusCode(200)
		.body("topics.title",hasItems("������⣬MTSC2018 ��������������������"))
		.body("topics.id[1]", equalTo(11402))
		;
	}
	
	@Test
	public void testhomeTopic() {
		Response response = given().when().get("https://testerhome.com/api/v3/topics/10254.json").prettyPeek()
		.then()
		.statusCode(200)
		.body("topics.id[-1]",equalTo(10254))
		.body("topics.findAll {topic->topic.id==10254}", hasItems("������Ƹ����"))
		.extract().response()
		;
		
		System.out.println("---------------");
		System.out.print(response.statusLine());
	}
	
//	@Test
//	public void testHomeSearch() {
//		given().queryParam("q","�������Ȳ���ѧԺ")
//		.when().get("https://testerhome.com/search").prettyPeek()
//		.then().statusCode(200)
//		;
//	}

}
