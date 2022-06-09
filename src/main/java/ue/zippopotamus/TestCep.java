package ue.zippopotamus;

import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import org.junit.Assert;
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
	public void TestvalidarCepPequisado() {
		ArrayList<String> dados = 
		given()
			
		.when()
			.get("/us/80228")
		.then()
			.log().all()
			.statusCode(200)
			.extract().path("post_code.findAll{it.startsWith('80228')}")
		;
		Assert.assertEquals(0,dados.size());
	}
	}
	

	

		


	

