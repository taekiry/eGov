package com.example.demo.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper // 인터페이스 구현클래스를 생성(싱글톤)해서 스프링컨테이너 빈 등록
// interface는 혼자 실행 불가지만 객체생성까지 알아서해줌 
public interface EmpMapper {
//	List<Map<String, Object>> selectEmp();
	List<EmpVO> selectEmp();

	EmpVO selectEmpById(Long employee_id);

	int insertEmp(EmpVO emp);

}
