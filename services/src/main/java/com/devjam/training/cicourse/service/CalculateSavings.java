package com.devjam.training.cicourse.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/calculateSavings")
public class CalculateSavings {
	
	@GET
	@Path("{subtotal}")
	@Produces("application/json")
	public Response calculateSavings(@PathParam("subtotal") Double subtotal)
	{
		double amountOfSavings = 0.0;
		
		String result = "@Produces(\"application/json\") Output: Tax: " + amountOfSavings;
		return Response.status(200).entity(result).build();
	}

}
