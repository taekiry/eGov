package com.example.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	MemberMapper memberMapper() {
		return new MemberMapper();
	}

	@Bean
	MemberService memberService() {
		MemberService service = new MemberService(memberMapper());
		return service;

	}
	// autowirde랑 component면 bean 지정안해도됨.
}
