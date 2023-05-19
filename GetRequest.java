package IGSAssignments;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetRequest {
	@Test()
	void getUser() {
		 
	given()
	   
	.when()
	   .get("https://cas5-0-urlprotect.trendmicro.com:443/wis/clicktime/v1/query?url=https%3a%2f%2freqres.in%2fapi%2fusers%3fpage%3d1&umid=82b3d321-54b0-4153-9766-c2e38c081fa0&auth=c36ba5e84c8cc876a4f686d0990d14296745b929-7ef4741bb3c1090c7574b3506467885d774d8c19")
	
	.then()
	.statusCode(200)
	.body("data[0].email",equalTo("michael.lawson@reqres.in"));
	   
	}

}
