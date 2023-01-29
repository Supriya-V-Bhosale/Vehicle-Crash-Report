//package com.nissan.service;
//
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//
//import org.junit.jupiter.api.Test;
//
//import com.jayway.jsonpath.internal.Path;
//import com.nissan.ib4.repositories.TemplateRepository;
//import com.nissan.ib4.services.TemplateService;
//
//public class TestGetFileService {
//	TemplateService service =new  TemplateService();
//	 private final String UPLOAD_DIRECTORY = "src/main/resources/upload/";
//	 
//	 @Test
//	    public void testGetFile() {
//	        // Create a test file with known contents
//	        String fileName = "test.txt";
//	        String fileContents = "Hello, world!";
////	        createTestFile(fileName, fileContents);
//
//	        // Call the getFile method
//	        byte[] fileData = service.getFile(fileName);
//
//	        // Compare the returned byte array with the expected contents
//	        assertArrayEquals(fileContents.getBytes(), fileData);
//	    }
//
//
////	    private void createTestFile(String fileName, String fileContents) {
////	        Path filePath =  (Path) Paths.get(UPLOAD_DIRECTORY + fileName);
////	        try {
//////	            Files.write(filePath, fileContents.getBytes());        	
////	        } catch (IOException e) {
////	            e.printStackTrace();
////	        }
////	    }
//	 
//	    } 
//
//
//
//
//
