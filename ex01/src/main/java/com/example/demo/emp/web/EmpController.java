package com.example.demo.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.emp.mapper.EmpMapper;

@Controller
public class EmpController {

	@Autowired
	EmpMapper empMapper; // new 쓸필요없어이제 자동 객체(빈)주입

	@GetMapping("emplist")
	public String empList(Model model) {
		model.addAttribute("empList", empMapper.selectEmp());
		return "empList"; // empList.html
	}
}
