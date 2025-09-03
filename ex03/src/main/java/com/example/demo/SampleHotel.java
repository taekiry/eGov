package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;



@Component
@Data
@AllArgsConstructor
public class SampleHotel {
	
	//@Autowired Chef chef2;
	
	public Chef chef;
	


}	
