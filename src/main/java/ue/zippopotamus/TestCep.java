package ue.zippopotamus;
import org.junit.BeforeClass;
import org.junit.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

	public class TestCep {  

	@BeforeClass
	public static void setup() {
		RestAssured.baseURI = "https://api.zippopotam.us";
		RestAssured.port = 443;
		RestAssured.basePath = "";
		
	}		
	
	@Test
	public void testValidarCepPesquisado() {
				
			given()	
				.queryParam("post code","90210")
				
			.when()
				.get("/us/90210")				
			
			.then()		
				.log().all()
				.statusCode(200);				
						
					
	}
}
	

	

		


	

