package com.nissan.ib4.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nissan.ib4.entities.Template;
import com.nissan.ib4.repositories.TemplateRepository;


@Service
public class TemplateService {
	@Autowired
	TemplateRepository templateRepository;
	public void uploadCSVFile( MultipartFile file ) {
		try {
            // Save the file to a specified directory
            byte[] bytes = file.getBytes();
            Path path = Paths.get("src/main/resources/upload/" +File.separator+ file.getOriginalFilename());
            Files.write(path, bytes);
            // Create a CSVFile object and save it to the database
//            Template csvFile = new Template( file.getOriginalFilename(), path.toString());
            
            templateRepository.save(path.toString());
        } catch (IOException e) {
            throw new RuntimeException("Failed to save file: " + e.getMessage());
        }
    }
	
	
	 public byte[] getFile(String fileName) {
	        try {
	            Path filePath = Paths.get("src/main/resources/upload/" + fileName);
	            return Files.readAllBytes(filePath);
	        } catch (IOException e) {
	            throw new RuntimeException("Failed to read file: " + e.getMessage());
	        }
	    }
	 
	 
	 public void deleteFile(String fileName) {
	        try {
	            Path filePath = Paths.get("src/main/resources/upload/" + fileName);
	            Files.deleteIfExists(filePath);
	        } catch (IOException e) {
	            throw new RuntimeException("Failed to delete file: " + e.getMessage());
	        }
	    }
	 
	 
	 
	 public void saveFile(String filePath, String fileName) {
         Template csvFile = new Template();
         csvFile.setFilePath(filePath);
         csvFile.setFileName(fileName);
         templateRepository.save(csvFile);
     }
	 
	    public void setTemplateRepository(TemplateRepository repository) {
	        this.templateRepository = repository;
	    }

		

}
