package com.example.demo.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.common.Paging;
import com.example.demo.emp.service.EmpService;
import com.example.demo.emp.service.EmpVO;

@Controller
public class EmpController {

	@Autowired
	EmpService empService; // new 쓸필요없어이제 자동 객체(빈)주입

	@GetMapping("emplist")
	public String empList(Model model, EmpVO emp, Paging paging) { // Model 왜?
		paging.setPageUnit(5);
		paging.setTotalRecord(empService.selectCount(emp));
		emp.setFirst(paging.getFirst());
		emp.setLast(paging.getLast());
		model.addAttribute("empList", empService.selectEmp(emp));
		return "empList"; // empList.html
	}

	@GetMapping("emp") // localhost/emp?employeeId=100
	public String emp(Model model, @RequestParam("employee_id") Long employee_id) {
		model.addAttribute("emp", empService.selectEmpById(employee_id));
		return "emp";

	}
}
