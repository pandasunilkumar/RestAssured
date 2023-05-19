package IGSAssignments;
import org.testng.annotations.Test;
import java.util.*;  

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class putRequest {
	int id;


	
		@Test(dependsOnMethods={"updateUser"})
		void createUser() {
			 
		HashMap<String, String> map=new HashMap<String, String>();
		
		map.put("email", "sunilkumarpanda@gmail.com");
		map.put("first_name", "sunil");
		map.put("last_name","panda");
		map.put("avatar", "https://reqres.in/img/faces/2-image.jpg");

		id = given()
		   .contentType("application/json")
		   .body(map)
		   
		  .when()
		   .post("https://reqres.in/api/users")
	       .jsonPath().getInt("id");
		   
		}
		
		@Test()
		void updateUser() {
			 
		HashMap<String, String> map=new HashMap<String, String>();
		
		map.put("email", "ramDas@gmail.com");
		map.put("first_name", "Ram");
		map.put("last_name","Das");
		map.put("avatar", "https://reqres.in/img/faces/3-image.jpg");
		
	 given()
		   .contentType("application/json")
		   .body(map)
		   
		   

		   
		.when()
		   .post("https://reqres.in/api/users"+id)

		.then()
		   .statusCode(201)
		   .body("data[0].email",equalTo("michael.lawson@reqres.in"));
		
		
		}
		


	}


