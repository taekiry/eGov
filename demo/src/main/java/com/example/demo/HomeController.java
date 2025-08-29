package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // node - router와 같은 역할
public class HomeController {

	@Autowired // 컨테이너에 담긴 component 불러오기
	Animal animal;

	@GetMapping("/")
	@ResponseBody

	public String home() {
		animal.sound();
		return "hello";
	}

	@GetMapping("/main")
	public String main() {
		return "main"; // templates/main.html로 ㄱㄱ
	}

}
