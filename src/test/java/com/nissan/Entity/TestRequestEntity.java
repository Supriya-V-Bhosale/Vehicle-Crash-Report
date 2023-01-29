package com.nissan.Entity;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import com.nissan.ib4.entities.Request;
import com.nissan.ib4.entities.Template;

public class TestRequestEntity {
	@Test
	public void testRequestEntity() {
	    // create test data
	    Integer requestId = 1;
	    Integer tempId = 2;
	    Template template = new Template();
	    DateTime createAt = new DateTime();
	    String status = "pending";

	    // create Request instance and set properties
	    Request request = new Request();
	    request.setRequestId(requestId);
	    request.setTempId(tempId);
	    request.setTemplate(template);
	    request.setCreateAt(createAt);
	    request.setStatus(status);

	    // assert that properties are set correctly
	    assertEquals(requestId, request.getRequestId());
	    assertEquals(tempId, request.getTempId());
	    assertEquals(template, request.getTemplate());
	    assertEquals(createAt, request.getCreateAt());
	    assertEquals(status, request.getStatus());
	}
	



}
