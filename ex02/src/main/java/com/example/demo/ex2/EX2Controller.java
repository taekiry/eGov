package com.example.demo.ex2;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.ex1.PersonForm;
import com.example.demo.ex1.UserVO;

import jakarta.validation.Valid;

@RequestMapping("/api")
@RestController // 기존 컨트롤러 + @ResponseBody (JSON)
public class EX2Controller {

	// UserVO 단건조회 RestController 는 리턴타입이 String이 아님.
	@GetMapping("/rest1")
	public UserVO getMethodName() {
		return new UserVO("홍", 251, new Date(), Arrays.asList("독서", "게임"));
		// hobby는 List라서 asList사용
	}

	// qeuryString : name=aaa&age=20
	@GetMapping("/rest2") // curl 실습때문에 get
	public UserVO rest2(UserVO user) {
		return user;
	}

	@PostMapping("/rest3") // json 스트링 : {"name":"aaa","age":10} === > vo // jsonString 겟방식불가
	public UserVO rest3(@RequestBody UserVO user) {
		return user;

	}

	// 서버끼리 통신
	@GetMapping("/rest4")
	public Map rest4() {
		RestTemplate rest = new RestTemplate();
		String uri = "https://jsonplaceholder.typicode.com/todos/1";
		return rest.getForObject(uri, Map.class);
	}
	
	
	//Rest보다 권장하는 방식 webClient(비동기) .block을 사용하면 동기식
	@GetMapping("/rest5")
	public String getPost() {
		WebClient webClient = WebClient.create();
		String response = webClient.get()
				.uri("https://jsonplaceholder.typicode.com/posts/1")
				.retrieve()
				.bodyToMono(String.class).block();
		return response;
	}


	
	
}
