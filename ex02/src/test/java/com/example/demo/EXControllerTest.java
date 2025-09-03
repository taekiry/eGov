package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.ex1.UserVO;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(EXControllerTest.class)
public class EXControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testList() throws Exception {
	
//	 UserVO userVO = new UserVO();
//	 userVO.setName("마이콜");
//	 userVO.setAge(20);
//
//	 String jsonStr = new ObjectMapper().writeValueAsString(reply);
//	String result =	mvc.perform( get("/api/rest2")
//				 .param("age","122"))
//				 .param("name","Hong")
//				 .andExpect(status().isOk())
//				 .andReturn().getResponse().getContentAsString();
//	System.out.println(result);

	}
}
