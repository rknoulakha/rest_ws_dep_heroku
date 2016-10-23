package com.test.error;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.test.beans.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	
	public Response toResponse(DataNotFoundException ex) {
		// TODO Auto-generated method stub
		ErrorMessage errorMessage = new ErrorMessage("Fail", ex.getMessage(), -10);
		return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
	}

}
