package com.devjam.training.cicourse.service;

import static org.junit.Assert.*;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.eclipsesource.restfuse.*;
import com.eclipsesource.restfuse.annotation.Context;
import com.eclipsesource.restfuse.annotation.HttpTest;

//import static com.eclipsesource.restfuse.Assert.*;

@RunWith( HttpJUnitRunner.class ) 
public class InventoryCheckTest {
	
	@Context
    private Response response; // will be injected after every request
	
	@Rule
	public Destination destination = new Destination( "http://localhost"); 
	

	 @HttpTest( method = Method.GET, path = "/" )
	  public void checkRestfuseOnlineStatus() {
	    //assertOk( response );
	  }  

	 /*
	@Test
	public void itemUnavailable() {
		InventoryCheck serviceDummy = new InventoryCheck();
		Response serviceResponse = serviceDummy.checkInventory("ABC-123");
		Assert.assertEquals(404, serviceResponse.getStatus());
		Assert.assertEquals("Some String", serviceResponse.toString());
	}
	*/
	
	@Test
	public void itemAvailable() {
		fail("Not yet implemented");
	}
	
	@Test
	public void itemBackordered() {
		fail("Not yet implemented");
	}

}
