package com.yedam.collet;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListVOTest {
	@Test
	public void test1() {
		List<EmpVO> list = new ArrayList<>();
//		list.add(new EmpVO(100, "홍길동"));
//		list.add(new EmpVO(101, "김유미"));
//		EmpVO emp = new EmpVO();
//		emp.setDept("설비");
//		emp.setEmpno("100");
//		emp.setEname("홍길동");
//
//		list.add(emp);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getEname());
		}
	}

	@Test
	public void test2() {
		DeptVO dept = DeptVO.builder().dname("aaa").build();
		DeptVO dept1 = DeptVO.builder().deptno(10).dname("bbb").build();
	}
}
