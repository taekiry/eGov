package com.example.demo;

import org.springframework.stereotype.Component;

//@Component
public class LgTV implements TV {
	
	public void powerOn() {
		System.out.println("LG TV--전원 on");
	}
	public void powerOff() {
		System.out.println("LG TV--전원 off");
	}
	public void volumeUp() {
		
		System.out.println("LG TV--볼륨 up");
	}
	public void volumeDown() {
	
		System.out.println("LG TV--볼륨 down");
	}
}