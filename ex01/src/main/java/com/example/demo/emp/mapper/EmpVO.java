package com.example.demo.emp.mapper;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data

@Builder

public class EmpVO {
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
}