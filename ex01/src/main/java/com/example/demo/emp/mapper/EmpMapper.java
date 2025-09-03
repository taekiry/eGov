package com.example.demo.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.emp.service.EmpVO;

@Mapper // 인터페이스 구현클래스를 생성(싱글톤)해서 스프링컨테이너 빈 등록
// interface는 혼자 실행 불가지만 객체생성까지 알아서해줌 
public interface EmpMapper {
//	List<Map<String, Object>> selectEmp();

	// 건수조회
	Long selectCount(EmpVO emp);

	// 전체조회
	List<EmpVO> selectEmp(EmpVO emp);

	// 단건조회
	EmpVO selectEmpById(Long employee_id);

	// 등록
	int insertEmp(EmpVO emp);

	// 부서 단건조회
	
	// 수정
	
	// 삭제
	
	// 퇴산
}
