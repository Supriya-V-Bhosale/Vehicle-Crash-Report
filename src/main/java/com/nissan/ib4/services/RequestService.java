package com.nissan.ib4.services;

import java.util.Optional;

import com.nissan.ib4.entities.Request;

public interface RequestService {
	Request sendRequest(Request request);
	Optional<Request> getRequestById(Integer requestId);
//	Request updateById(Request request, Integer requestId);
	Request updateById(Request request);

}
