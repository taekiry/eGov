package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.bean.MemberService;

import lombok.extern.log4j.Log4j2;


@Log4j2
@SpringBootTest
public class BeanTest {
	
	@Autowired MemberService memberService;
	
	@Test
	public void test() {
		memberService.print(); 
	}
}
