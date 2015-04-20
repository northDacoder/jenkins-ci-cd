package com.devjam.training.cicourse.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/checkInventory")
public class InventoryCheck {
	
	@Path("{sku}")
	@GET
	@Produces("application/json")
	public Response checkInventory(@PathParam("sku") String sku)
	{
		String result = "";
		int returnCode = 0;
		boolean inventoryAvailable = false;
		int inventoryAmount = 0;
		
		if(inventoryAvailable)
		{
			result = "@Produces(\"application/json\") Output: Inventory: " + inventoryAmount;
			returnCode = 200;
		}
		else
		{
			result = "@Produces(\"application/json\") Output: Inventory: No Inventory";
			returnCode = 404;
		}
	
		return Response.status(returnCode).entity(result).build();
	}
}
