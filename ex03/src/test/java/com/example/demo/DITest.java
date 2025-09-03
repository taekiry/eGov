package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DITest {
	@Autowired TV tv;
	@Autowired SampleHotel hotel;
	@Autowired Chef chef;
	
//	@Test
	public void test1() {
//		TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
				
	};
//	@Test
	public void test2() {
		chef.setName("이동섭");
		System.out.println("셰프의 이름 : " + hotel.chef.getName());
	}
	
}
