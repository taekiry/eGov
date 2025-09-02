package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.example.demo.**.mapper") // 모든파일 mapper어노테이션 찾기 -> com.example.demo.로
															// 시작해서.mapper로끝나는거찾기
@SpringBootApplication
public class Ex01Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex01Application.class, args);
	}

}
