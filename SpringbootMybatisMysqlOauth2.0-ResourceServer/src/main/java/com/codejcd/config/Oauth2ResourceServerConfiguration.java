package com.codejcd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class Oauth2ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		    // http.headers().frameOptions().disable(); // X-Frame-Options 설정
	        http.authorizeRequests()
	        		// access token이 있어야 접근 가능
	                //.antMatchers("/user/list1").access("isAuthenticated()"); // 인증 받은 경우 해당 URI 에 접근 가능
	                .anyRequest().authenticated(); // 모든 요청은 인증 받아야 접근 가능
    }	
}
