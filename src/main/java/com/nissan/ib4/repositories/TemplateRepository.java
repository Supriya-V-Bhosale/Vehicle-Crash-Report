package com.nissan.ib4.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.ib4.entities.Template;
@Repository
public interface TemplateRepository extends JpaRepositoryImplementation<Template, Integer> {
	
	void save(String filePath);



	

	
}
