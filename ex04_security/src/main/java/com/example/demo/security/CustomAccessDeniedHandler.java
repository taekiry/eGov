package com.example.demo.security;

import java.io.IOException;
import java.net.http.HttpResponse.ResponseInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomAccessDeniedHandler implements AccessDeniedHandler {

	private Logger log = LoggerFactory.getLogger(CustomAccessDeniedHandler.class);
    //private final ObjectMapper objectMapper;

    @Override
    public void handle(HttpServletRequest request,
                       HttpServletResponse response,
                       AccessDeniedException accessDeniedException) throws IOException, ServletException {
    	// response.sendRedirect("");컨트롤러
    	
    	response.setContentType("text/html;charset=utf-8");
    	response.getWriter().append("<script>")
					    	.append("alert('접근 오류 권한이 없습니다.');")
					    	.append("location.href='/';")
					    	.append("</script>");	
     
    		
  
    }
    
    
    // end handle

}
