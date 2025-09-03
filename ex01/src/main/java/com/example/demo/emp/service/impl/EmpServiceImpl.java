package com.example.demo.emp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.emp.mapper.EmpMapper;
import com.example.demo.emp.service.EmpService;
import com.example.demo.emp.service.EmpVO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service // = @Component
public class EmpServiceImpl implements EmpService {
	
	final EmpMapper empMapper;

	
	@Override
	public Long selectCount(EmpVO emp) {
		return empMapper.selectCount(emp);
		
	}
	
	@Override
	public List<EmpVO> selectEmp(EmpVO emp) {
		return empMapper.selectEmp(emp);
		
	}

	@Override
	public EmpVO selectEmpById(Long employee_id) {
		return empMapper.selectEmpById(employee_id);
		
	}

	@Override
	public int insertEmp(EmpVO emp) {
		return empMapper.insertEmp(emp);
		
	}


}
