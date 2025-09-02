package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.emp.mapper.EmpMapper;
import com.example.demo.emp.service.EmpVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class EmpMapperTest {
	@Autowired
	EmpMapper empMapper;

	@DisplayName("전체조회")
//	@Test
	public void selectEmp() {
		EmpVO emp = new EmpVO();
		emp.setDepartment_id(50L);
		emp.setFirst(1);
		emp.setLast(30);
		emp.setFirst_name("peter");
		List<EmpVO> list = empMapper.selectEmp(emp);
		list.forEach(emps -> System.out.println(emps));
	}

	@DisplayName("단건조회")
	@Test
	public void selectEmpById() {
		EmpVO emp = empMapper.selectEmpById(100L);
		log.warn("부서명 : " + emp.getDept().getDepartment_name());
	}

	@DisplayName("등록")
//	@Test
	public void isnsertEmp() {
		EmpVO emp = EmpVO.builder().employee_id(400L).email("xozlfl789@naver.com").last_name("홍").job_id("IT_PROG")
				.hire_date(new Date()).build();

		int result = empMapper.insertEmp(emp);
	}

	@DisplayName("갯수")
	// @Test
	public void countEmp() {

//		System.out.println(empMapper.selectCount());
	}
}
