package com.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/operations")
public class OperationsImpl implements IOperations {

	@GET
	@Produces("text/plain")
	public String helloWord() {
		return "HEHE";		 
	}
	
}
