package com.nissan.contoller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.nissan.ib4.controllers.TemplateController;
import com.nissan.ib4.repositories.TemplateRepository;
import com.nissan.ib4.services.TemplateService;



public class TestUploadContoller {
	@MockBean
	private TemplateService service;
	
	
	
	@Test
	public void testHandleFileUpload() throws IOException {
	    // Create an instance of the controller class
	    TemplateController controller = new TemplateController();

	    // Create mocks for the service and repository classes
	    TemplateService service = mock(TemplateService.class);
	    TemplateRepository repository = mock(TemplateRepository.class);

	    // Inject the mocks into the controller class
	    controller.setService(service);
//	    controller.setRepository(repository);

	    // Create a mock file
	    MultipartFile file = mock(MultipartFile.class);
	    when(file.getOriginalFilename()).thenReturn("test.csv");
	    when(file.getBytes()).thenReturn("test data".getBytes());

	    // Call the handleFileUpload method
	    ResponseEntity<String> response = controller.handleFileUpload(file);

	    // Verify that the file was saved to the correct directory
	    Path path = Paths.get("src/main/resources/upload"+File.separator + file.getOriginalFilename());
	    assertTrue(Files.exists(path));

	    // Verify that the file's original filename was captured correctly and saved in the database
	    verify(service).saveFile(path.toString(), file.getOriginalFilename());
	   
	    // Verify that a successful response was returned
	    assertEquals(HttpStatus.OK, response.getStatusCode());
	}

  }
