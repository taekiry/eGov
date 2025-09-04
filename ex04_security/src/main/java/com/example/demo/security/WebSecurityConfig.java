package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity //security 필터 등록 annotation 
//spring이면 web.xml에 따로 등록해야함.
public class WebSecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests((requests) -> requests
				.requestMatchers("/", "/home").permitAll()
				.requestMatchers("/admin").hasRole("ADMIN") //Role로 /admin 은 ADMIN만 가능
				.anyRequest().authenticated()
			)
			.formLogin( (form) -> form
				.loginPage("/login")
				.permitAll()
				.successHandler(authenticationSuccessHandler())				
		    )
			
			.logout((logout) -> logout.permitAll());
			// 토큰 발행 안함.
			http.csrf(csrf -> csrf.disable());
			
			http.exceptionHandling(ex -> ex.accessDeniedHandler(accessDeniedHandler()));
			
		return http.build();
	}

//	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user =
			 User.withDefaultPasswordEncoder()
				.username("user")
				.password("1234")
				.roles("USER")
				.build();

		UserDetails admin =
				 User.withDefaultPasswordEncoder()
					.username("admin")
					.password("1234")
					.roles("ADMIN")
					.build();
		return new InMemoryUserDetailsManager(user,admin);
	}
	
	@Bean
	public AuthenticationSuccessHandler authenticationSuccessHandler() {
		return new CustomLoginSuccessHandler();
	}
	
	@Bean
	public AccessDeniedHandler accessDeniedHandler() {
		return new CustomAccessDeniedHandler();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}