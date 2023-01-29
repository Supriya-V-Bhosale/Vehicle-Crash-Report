package com.nissan.ib4.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.ib4.entities.Request;
import com.nissan.ib4.repositories.RequestRepositry;

@Service
public class RequestServiceImplementation implements RequestService {

	@Autowired
	RequestRepositry reuestRepo;

	@Override
	@Transactional
	public Request sendRequest(Request request) {
		// TODO Auto-generated method stub
		return reuestRepo.save(request);
	}

	@Override
	public Optional<Request> getRequestById(Integer requestId) {
		return reuestRepo.findById(requestId);

	}

	@Override
	public Request updateById(Request request) {
		// TODO Auto-generated method stub
		return reuestRepo.save(request);
	}

}
