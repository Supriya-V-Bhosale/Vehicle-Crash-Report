package com.nissan.ib4.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import com.nissan.ib4.entities.Request;
@Repository
public interface RequestRepositry extends JpaRepositoryImplementation<Request, Integer> {

}
