package com.nissan.ib4.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.MediaType;

import com.nissan.ib4.entities.Template;
import com.nissan.ib4.repositories.TemplateRepository;
import com.nissan.ib4.services.TemplateService;

@RestController
@RequestMapping("api/")
public class TemplateController {
	@Autowired
	TemplateService templateService;
	@Autowired
	TemplateRepository templateRepository;
	
	@PostMapping("/upload")
	public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
		try {
            // Save the file to a specified directory
            byte[] bytes = file.getBytes();
            Path path = Paths.get("src/main/resources/upload"+File.separator + file.getOriginalFilename());
            Files.write(path, bytes);
            Template csvFile = new Template(file.getOriginalFilename(), path.toString());
            
            templateService.saveFile(path.toString(),file.getOriginalFilename());
//           templateRepository.save(csvFile);            // code to save csvFile to database
            return ResponseEntity.ok().build();
        } catch (IOException e) {
            return ResponseEntity.badRequest().build();
        }
    }
	
	
	
	 @GetMapping("/{fileName}")
	    public ResponseEntity<byte[]> getFile(@PathVariable String fileName) {
	        byte[] fileBytes = templateService.getFile(fileName);
	        return ResponseEntity.ok().contentType(MediaType.APPLICATION_OCTET_STREAM)
	                .body(fileBytes);
	    }
	    
	    @DeleteMapping("/{fileName}")
	    public ResponseEntity<Void> deleteFile(@PathVariable String fileName) {
	    	templateService.deleteFile(fileName);
	        return ResponseEntity.noContent().build();
	    }



		public void setService(TemplateService service) {
			// TODO Auto-generated method stub
			this.templateService=service;
			
		}



}
