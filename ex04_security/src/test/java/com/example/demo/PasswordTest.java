package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordTest {
	
	@Test
	public void encode() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
		String result = encoder.encode("1234");
		System.out.println(result);
		assertTrue(encoder.matches("1234", result));	
	}
	
}
