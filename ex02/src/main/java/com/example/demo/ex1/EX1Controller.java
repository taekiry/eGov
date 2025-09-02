package com.example.demo.ex1;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("/api")
public class EX1Controller {

	@GetMapping("/main")
	// tmeplates/api/main/html -> void쓰면
	public void main() {

	}

	@GetMapping("/sample")
	// Model => db조회 서비스호출 파라미터 처리 된 값을 뷰로 전달.
	public ModelAndView sample() {
		ModelAndView mv = new ModelAndView("sample");
		mv.addObject("today", new Date());
		return mv;
	}

	// spring 커맨드 객체 -> 알아서 맵핑 (필드명 - 변수 같아야함)
	@GetMapping("/ex1")
	public String ex1(@ModelAttribute("user") UserVO useVO, Model model) {
		// model.addAttribute("user", userVO);
		log.info(useVO);
		return "sample";
	}

	// 인덱스 지정 -> 배열로 받기 가능
	@GetMapping("/ex2")
	public String ex2(UserListVO userList) {
		log.info(userList);
		return "sample";
	}

	// 개별 파라미터로 하나씩 받기도 가능
	@GetMapping("/ex3")
	public String ex3(@RequestParam String name, //
			@RequestParam(value = "userage", required = false, defaultValue = "21") Integer age) {
		// value로 파라미터랑 변수랑 다른경우(userVO는 userage란게 없으니까) 매핑가능.
		log.info(name + ":" + age);
		return "sample";
	}

	// 맵으로 모든 파라미터 받기
	@GetMapping("/ex4")
	public String ex4(@RequestParam Map<String, Object> map) {
		log.info(map);
		return "sample";
	}

	// uri 형식 지정 파라미터
	@GetMapping("/ex5/{name}/{age}")
	public String ex5(@PathVariable String name, @PathVariable Integer age) {
		log.info("path = " + name + " : " + age);
		return "sample";
	}

	@PostMapping("/ex6")
	public String ex6(UserVO uservo, MultipartFile pic) {
		log.info(pic.getOriginalFilename());
		log.info(pic.getSize());
		log.info(uservo);
		return "sample";
	}

}
