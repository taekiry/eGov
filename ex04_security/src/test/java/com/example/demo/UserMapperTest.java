package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.security.mapper.UserMapper;
import com.example.demo.security.service.RoleVO;
import com.example.demo.security.service.UserVO;

import lombok.extern.log4j.Log4j2;


@Log4j2
@SpringBootTest
public class UserMapperTest {

	@Autowired
	UserMapper userMapper;
	
//	@Test
	public void getUser() {
		UserVO vo = userMapper.getUser("user");
		log.info(vo);
	}
	
	@Test
	public void getRole() {
		RoleVO vo = userMapper.getRole(2L);
		log.info(vo);
	}
}
