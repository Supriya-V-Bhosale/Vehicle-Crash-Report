package com.nissan.contoller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.nissan.ib4.controllers.TemplateController;
import com.nissan.ib4.services.TemplateService;

public class TestDeletFile {
	
	
	@Test
	public void testDeleteFile() {
		TemplateController controller = new TemplateController();
		TemplateService service = mock(TemplateService.class);
	    // Create a mock templateService
	    TemplateService templateService = mock(TemplateService.class);
	    
	    // Inject the mock into the controller
	    controller.setService(templateService);
	    
	    // Call the deleteFile method of the controller
	    String fileName = "test.csv";
	    ResponseEntity<Void> response = controller.deleteFile(fileName);
	    
	    // Verify that the deleteFile method of the mock templateService was called with the correct file name
	    verify(templateService).deleteFile(fileName);
	    
	    // Verify that the returned response has a status code of 204
	    assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
	}


}
