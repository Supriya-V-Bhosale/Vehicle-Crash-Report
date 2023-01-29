package com.nissan.ib4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nissan.ib4.repositories.UserRepository;

@SpringBootTest
class Assignment2ApplicationTests {

	@Autowired
	private UserRepository userRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void repoTest() {

		String className = this.userRepo.getClass().getName();
		System.out.println(className);
	}
}
