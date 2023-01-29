package com.nissan.ib4.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.ib4.entities.Request;
import com.nissan.ib4.services.RequestService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class RequestController {
	@Autowired
	RequestService requestService;
	
	// Send  Request -- http://localhost:9091/api/requests
	@PostMapping("requests")
	public Request sendRequest(@RequestBody Request request) {
		return requestService.sendRequest(request);
	}
	
	// Get  Request By Id-- http://localhost:9091/api/requests/id
	@GetMapping("requests/{requestId}")
	public Optional<Request> getRequestById(@PathVariable Integer requestId) {
		return requestService.getRequestById(requestId);
	}
	//Update status of the request --http://localhost:9091/api/updateStatus
	@PutMapping("updateStatus")
	public Request updateStatus( @RequestBody Request request) {
		return requestService.updateById(request);
	}
	

}
