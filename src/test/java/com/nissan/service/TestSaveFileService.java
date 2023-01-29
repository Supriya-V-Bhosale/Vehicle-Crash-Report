//package com.nissan.service;
//
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.verify;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//
//import org.junit.jupiter.api.Test;
//
//import com.nissan.ib4.entities.Template;
//import com.nissan.ib4.repositories.TemplateRepository;
//import com.nissan.ib4.services.TemplateService;
//
//public class TestSaveFileService {
//	TemplateService service=new TemplateService();
//	 TemplateRepository templateRepository = mock(TemplateRepository.class);
//	
//	@Test
//	 public void testSaveFile() {
//		 	
//	        // Given
//	        String filePath = "src/main/resources/upload/";
//	        String fileName = "fileName.csv";
//	        Template csvFile = new Template();
//
//	        // When
//	        service.saveFile(filePath, fileName);
//	        
//
//	        // Then
//	        verify(templateRepository).save(csvFile);
//	    }
//	
//	public void saveFile(String filePath, String fileName) {
//	    try {
//	        File file = new File(filePath + "/" + fileName);
//	        if(file.exists() && !file.isDirectory()) {
//	            Template csvFile = new Template();
//	            csvFile.setFilePath(filePath);
//	            csvFile.setFileName(fileName);
//	            templateRepository.save(csvFile);
//	        }else{
//	            throw new FileNotFoundException("File not found at the specified location");
//	        }
//	    } catch (Exception e) {
//	        throw new RuntimeException("Failed to save file: " + e.getMessage());
//	    }
//	}
//
//}
