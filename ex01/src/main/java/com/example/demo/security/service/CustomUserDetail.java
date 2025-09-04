package com.example.demo.security.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class CustomUserDetail implements UserDetails{

	
	UserVO userVO;
	
	public CustomUserDetail (UserVO userVO) {
		this.userVO = userVO;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> list = new ArrayList<>();
		userVO.getRoles().forEach(role -> list.add(new SimpleGrantedAuthority(role.getRole_name())));
		return list;
	
	}

	@Override
	public String getPassword() {
		return userVO.getPassword();
		 
	}

	@Override
	public String getUsername() {
		return userVO.getLogin_id();
	}

}
