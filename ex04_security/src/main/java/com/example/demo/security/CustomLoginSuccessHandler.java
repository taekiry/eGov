package com.example.demo.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
//import com.example.demo.security.service.CustomerUser;
//import com.example.demo.security.service.UserDTO;

import com.example.demo.security.service.CustomUserDetail;
import com.example.demo.security.service.UserVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, 
			                 HttpServletResponse response,
			                 Authentication auth) throws IOException, ServletException {
		//단건조회
		UserVO vo = ((CustomUserDetail)auth.getPrincipal()).getUserVO();
		
		//session
		request.getSession().setAttribute("userid", vo.getId());
		request.getSession().setAttribute("deptName", vo.getDeptName());
		
		//username, role
		List<String> roleNames = new ArrayList<>();		
		// 한사람당 role이 여러개일 수 있어서 List<String>
		auth.getAuthorities().forEach( authority -> {
			roleNames.add( authority.getAuthority());
		}  );		
		System.out.println("roleName:" + roleNames);
		
		if ( roleNames.contains("ROLE_ADMIN") ) {
			response.sendRedirect("/admin");
			return;
		} else if ( roleNames.contains("ROLE_USER") ) {
			response.sendRedirect("/hello");
			return;
		} 
		response.sendRedirect("/");
	}

}


