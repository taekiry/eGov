package com.example.demo.security.service;

import java.util.List;

import lombok.Data;

@Data

// security가 알아먹게 VO 설정하기
public class UserVO {
	  private Long id;
	  private String loginId;
	  private String password;
	  private String fullName;
	  private String deptName;
	  
	  private List<RoleVO> roles;

	  
	
	// getAuthorities, getUserName이 있어야 security가 알아먹음
	  
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		List<GrantedAuthority> list = new ArrayList<>();
//		roles.forEach(role -> list.add(new SimpleGrantedAuthority(role.getRoleName())));
//		return list;
//	}
//
//	@Override
//	public String getUsername() {
//		return loginId;
//	}
//	  
	  
	  
}