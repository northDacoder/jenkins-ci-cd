package com.devjam.training.cicourse.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/calculateTax")
public class CalculateTax {
	
	@Path("{total}/{state}")
	@GET
	@Produces("application/json")
	public Response calculateTax(@PathParam("total") Double total, @PathParam("state") String state)
	{
		double amountOfTax = 0.0;
		
		String result = "@Produces(\"application/json\") Output: Tax: " + amountOfTax;
		return Response.status(200).entity(result).build();
	}

}
