package com.nisssan.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;


import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.nissan.ib4.entities.Template;
import org.mockito.junit.jupiter.MockitoExtension;
import com.nissan.ib4.repositories.TemplateRepository;

@ExtendWith(MockitoExtension.class)
public class TestSaveRepository {
	
	

	    @Mock
	    private EntityManager em;

	    @InjectMocks
	    private TemplateRepository repository;

	    @Test
	    void testSave() {
	    	
	        String filePath = "src/main/resources/upload/file.txt";

	        // Act
	        repository.save(filePath);
//	        String savedFilePath = ( repository).getFilePath();

	        // Assert
//	        assertEquals(filePath, savedFilePath);
	    }
	    }
	



