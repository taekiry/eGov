package com.example.demo.emp.service;

import java.util.Date;

import com.example.demo.common.SearchVO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Builder
@NoArgsConstructor
@AllArgsConstructor
// class 상속은 extends 인터페이스는 implements 

public class EmpVO extends SearchVO {
	// app-properties에서 camel-case = false라서
	private Long employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private Date hire_date;
	private String job_id;
	private Double salary;
	private Double commission_pct;
	private Long manager_id;
	private Long department_id;

	// 조인안쓰고 값받아오기
	DeptVO dept;
}