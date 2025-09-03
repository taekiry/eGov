package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class MemberService {
	MemberMapper memberMapper;
	
	public void print() {
		System.out.println(memberMapper + "서비스호출");
	}
}	
