package com.nissan.contoller;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.nissan.ib4.controllers.TemplateController;
import com.nissan.ib4.services.TemplateService;

public class TestGetFile {
	@Test
	public void testGetFile() {
		TemplateController controller = new TemplateController();
		TemplateService service = mock(TemplateService.class);
	    // Create a mock templateService
//	    TemplateService mockService = mock(TemplateService.class);
	    byte[] expectedBytes = "test data".getBytes();
	    when(service.getFile("test.csv")).thenReturn(expectedBytes);
	    
	    // Inject the mock service into the controller
	    controller.setService(service);

	    // Call the getFile method
	    ResponseEntity<byte[]> response = controller.getFile("test.csv");

	    // Verify that the response has the correct HttpStatus and body
	    assertEquals(HttpStatus.OK, response.getStatusCode());
	    assertArrayEquals(expectedBytes, response.getBody());
	    assertEquals(MediaType.APPLICATION_OCTET_STREAM, response.getHeaders().getContentType());
	}


}
