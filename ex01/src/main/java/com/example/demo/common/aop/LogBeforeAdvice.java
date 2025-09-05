package com.example.demo.common.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogBeforeAdvice {

	
						// 리턴타입 : all , com.example, Impl로 끝나는, 모든 메서드()
		@Pointcut("execution(* com.example..*Impl.*(..))")
		public void allpointcut() {}
		
		@Before("allpointcut()")
		public void print() {
			System.out.println("[before] 로그 실행");
		}	
	}

