package com.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class FirstResource {
	
	@Path("/resource1")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String getMessage1() {
		return "1 , Hello, REST!";
	}
	
	@Path("/resource2")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String getMessage2() {
		return "2 , Hello, REST!";
	}
	
	@Path("/resource3")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String getMessage3() {
		return "3 , Hello, REST!";
	}
}
