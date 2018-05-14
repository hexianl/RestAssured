package test1;

import org.junit.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class test1 {
	
	@Test
	public void getURLtest() {
		//print out the API message

		
		//get("https://testerhome.com/api/v3/topics.json?limit=2&offset=0&type=last_actived").prettyPeek();
		
		/*Map<String,Object> map = new  HashMap<String,Object>();
		map.put("limit",2);
		map.put("offset","0");
		map.put("type", "last_actived");
		
		given().params(map).get("https://testerhome.com/api/v3/topics.json").prettyPeek();*/
		
		//given().param("user[login]", "test@qq.com").param("user[password]", "111111").param("user[remember_me]", 0)
		//.post("https://testerhome.com/account/sign_in").prettyPeek();
		
//		Map<String,Object> map = new  HashMap<String,Object>();
//		map.put("user[login]","test@qq.com");
//		map.put("user[password]","111111");
//		map.put("user[remember_me]", "0");
//		given().params(map)
//		.post("https://testerhome.com/account/sign_in").prettyPeek();
		
//		given().body("{\"message\":\"hello world\"}").post("https://testerhome.com/api/v3/topics.json").prettyPeek();
//		File file = new File("C:/HP/IT/DirectAccess/directaccessgroupupdate.txt");
//		
//		given().body(file).post("https://testerhome.com/api/v3/topics.json").prettyPeek();
		
	}
	
	@Test
	public void jsonpathtest(){
		Map<String,Object> map = new  HashMap<String,Object>();
		map.put("limit",2);
		map.put("offset","0");
		map.put("type", "last_actived");
		
		Response response = given().params(map).get("https://testerhome.com/api/v3/topics.json");
		
		List<Object> list = response.jsonPath().getList("topics");
		
		System.out.println("The list number:\t\n" + list.size());
		for (int i = 0;i< list.size();i++) {
			String sValue = response.jsonPath().getString("topics["+i+"].id");
			System.out.println("The list value:\n\t" + sValue);	
		}
		

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
  