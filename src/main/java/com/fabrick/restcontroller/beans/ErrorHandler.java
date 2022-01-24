package com.fabrick.restcontroller.beans;

import java.io.IOException;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

public class ErrorHandler implements ResponseErrorHandler{
	
	@Override
	  public void handleError(ClientHttpResponse response) throws IOException {
		System.out.println("handleError");
	  }

	  @Override
	  public boolean hasError(ClientHttpResponse response) throws IOException {
		  System.out.println("hasError");
		  return true;
	  }
}
