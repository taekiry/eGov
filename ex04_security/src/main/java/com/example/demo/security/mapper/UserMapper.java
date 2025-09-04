package com.example.demo.security.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.security.service.RoleVO;
import com.example.demo.security.service.UserVO;

@Mapper
public interface UserMapper {
	UserVO getUser(String loginId);
	RoleVO getRole(Long id);
}
