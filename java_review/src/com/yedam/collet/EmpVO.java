package com.yedam.collet;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@RequiredArgsConstructor
// final 이 있으면 기본생성자는 불가능
//@NoArgsConstructor
@Data
//@Builder
@AllArgsConstructor

// 위 전부 다 추가해줌 data하나로

public class EmpVO {
	private int empno;
	private String ename;
	private int dept;

//	public EmpVO(String empno, String ename) {
//		this.empno = empno;
//		this.ename = ename;
//	}
}
