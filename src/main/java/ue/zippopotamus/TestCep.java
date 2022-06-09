package ue.zippopotamus;

import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;



	public class TestCep {  


	@BeforeClass
	public static void setup() {
		RestAssured.baseURI = "https://api.zippopotam.us";
		RestAssured.port = 443;
		RestAssured.basePath = "";
		
	}	
	
//	@Test
//	public void testValidarEndereco() {
		
//			String response = given().toString();
//			given(//)
//			
//			.log().all()
//			.contentType(ContentType.JSON)
			
//		.when()
//			.get("/us/80211")
//		.then()
	//		.log().all()
//			.statusCode(200)
//			.body( "post_code"is("80211"))	
//			.body( "country", is("United States"))	
//			.body( "country_abbreviation", is("US"))		
//			.body( "places.place_name",is("Denver"))
//			.body( "places.longitude",is( "-105.0204"))
	//		.body( "places.state",is( "Colorado"))
	//		.body( "places.state abbreviation",is( "CO"))
	//		.body( "places.latitude",is( "39.7665"))		
				
	//	;
//	}
	
	

//}
	
	
//	@Test
//	public void nirJPathComJava() {
	//	ArrayList<String> dados = 
	//	given()
//	//		
	//	.when()
	//		.get("https://api.zippopotam.us/us/80228")
	//	.then()
			//.log().all()
		//	.statusCode(200)
	//		.extract().path("post_code.findAll{it.startsWith('80225')}")
		;
	//	Assert.assertEquals(0,dados.size());
//	}
	//}
	
	@Test
	public void nirJPathComJava1() {
		
		given()
			
		.when()
			.get("us/80222")
		.then()
			.log().all()
			.statusCode(200)
			.body( "placas.state",is("Colorado"))
			
		;
	
	}
	}
	

		


	

