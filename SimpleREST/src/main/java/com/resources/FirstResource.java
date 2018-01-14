package com.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/myresource")
public class FirstResource {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String getMessage() {
		return "1 , Hello, REST!";
	}
}
