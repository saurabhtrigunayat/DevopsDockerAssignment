package com.nagarro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public ResponseEntity<String> getUserName() {
		return ResponseEntity.ok("Username : Saurabh Trigunayat");
	}
}
