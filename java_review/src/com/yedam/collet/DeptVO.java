package com.yedam.collet;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DeptVO {
	private int deptno;
	private String dname;
	private int location;
}
