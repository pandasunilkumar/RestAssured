package IGSAssignments;

import org.testng.annotations.Test;
import java.util.*;  
import static io.restassured.RestAssured.*;


public class postRequest {
	@Test(dependsOnMethods={"updateUser"})
	void createUser() {
		 
	HashMap<String, String> map=new HashMap<String, String>();
	
	map.put("email", "sunilkumarpanda@gmail.com");
	map.put("first_name", "sunil");
	map.put("last_name","panda");
	map.put("avatar", "https://reqres.in/img/faces/2-image.jpg");

	
	
	given()
	   .contentType("application/json")
	   .body(map)
	   
	  .when()
	  
	   .post("https://reqres.in/api/users")
	  .then()
	  .statusCode(201)
	  .log().all();
  
	   
	}
	
}
