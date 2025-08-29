package com.example.demo;

import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.emp.mapper.EmpMapper;
import com.example.demo.emp.mapper.EmpVO;

@SpringBootTest
public class EmpMapperTest {
	@Autowired
	EmpMapper empMapper;

	@DisplayName("전체조회")
//	@Test
	public void selectEmp() {
		empMapper.selectEmp().forEach(emp -> System.out.println(emp.getLast_name()));
	}

	@DisplayName("단건조회")
//	@Test
	public void selectEmpById() {
		EmpVO emp = empMapper.selectEmpById(100L);
		System.out.println(emp.getFirst_name());
	}

	@DisplayName("등록")
	@Test
	public void isnsertEmp() {
		EmpVO emp = EmpVO.builder().employee_id(400L).email("xozlfl789@naver.com").last_name("홍").job_id("IT_PROG")
				.hire_date(new Date()).build();

		int result = empMapper.insertEmp(emp);
	}

}
