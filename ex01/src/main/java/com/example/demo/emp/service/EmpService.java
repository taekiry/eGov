package com.example.demo.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.emp.mapper.EmpMapper;

// use case diagram 
/* 
 * 사용자의 시스템 기능이 서비스가됨.
 *      서비스                     매퍼
 *    시스템 기능                데이터 베이스 처리
 * boardService.delete()      boardMapper.deleteById(1) 
 * 
 * 
 * */
public interface EmpService {
	// 사원 등록

	// 사원 수정

	// 사원 삭제

	// 퇴사

	// 조회
	Long selectCount(EmpVO emp);

	// 전체조회
	List<EmpVO> selectEmp(EmpVO emp);

	// 단건조회
	EmpVO selectEmpById(Long employee_id);

	// 등록
	int insertEmp(EmpVO emp);

}
