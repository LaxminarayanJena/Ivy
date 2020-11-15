package jena;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IvyTest {

	public void IvyMethod() throws IOException {


	}

	@Test
	public void createbody() throws JsonProcessingException {
		ChildServices childservices = new ChildServices();
		childservices.setName("aa");
		childservices.setStatus("status");
		childservices.setError("error");
		
		

		Scenarios scenarios = new Scenarios();
		scenarios.setName("Registration");
		scenarios.setStatus("fail");
		

		Example ivy = new Example();
		ivy.setEnv("QA1");
		ivy.setType("SmokeTest");
		ivy.setGroup("Core");
		ivy.setCluster("GVC");
		ivy.setTimeStamp("2020-11-02 12:57:2");
		
		
		

		ObjectMapper obj = new ObjectMapper();
		System.out.println(obj.writerWithDefaultPrettyPrinter().writeValueAsString(ivy));

	

	}

}