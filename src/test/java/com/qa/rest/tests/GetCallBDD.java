package com.qa.rest.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;



public class GetCallBDD {


@Test
public void test_numberOfCircutsFor2019_Season() {
	
	
given().
when().
  get("http://ergast.com/api/f1/2019/circuits.json").
then().
    assertThat().
    body("MRData.CircuitTable.Circuits.circuitId", hasSize(21));
    
   
}
}