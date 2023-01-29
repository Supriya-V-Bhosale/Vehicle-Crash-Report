package com.nissan.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.nissan.ib4.repositories.TemplateRepository;
import com.nissan.ib4.services.TemplateService;

public class TestUploadCSVFileService {
	
	@Test
	public void testUploadCSVFile() throws IOException {
		TemplateService service =new  TemplateService();
		TemplateRepository templateRepository = mock(TemplateRepository.class);
		
	    // Create a mock file
	    MultipartFile file = mock(MultipartFile.class);
	    when(file.getOriginalFilename()).thenReturn("test.csv");
	    when(file.getBytes()).thenReturn("test data".getBytes());

	    // Call the uploadCSVFile method
	   
	    service.setTemplateRepository(templateRepository);
	    
	    service.uploadCSVFile(file);

	    // Verify that the file was saved to the correct directory
	    Path path = Paths.get("src/main/resources/upload/" + file.getOriginalFilename());
	    assertTrue(Files.exists(path));

	    // Verify that the file's original filename and file path were captured correctly and saved in the database
	    verify(templateRepository).save(path.toString());
	}


}
