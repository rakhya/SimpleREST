package com.exceptions;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.models.ErrorMessage;

@Provider
public class GenericExceptionHandler implements ExceptionMapper<Throwable> {

	public Response toResponse(Throwable ex) {
		String[] s = ex.getMessage().split(" ");
		ErrorMessage msg = new ErrorMessage(Integer.parseInt(s[1]),ex.getMessage(),"Report to abc@gmail.com");
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.type(MediaType.APPLICATION_JSON)
				.entity(msg)
				.build();
	}

}
