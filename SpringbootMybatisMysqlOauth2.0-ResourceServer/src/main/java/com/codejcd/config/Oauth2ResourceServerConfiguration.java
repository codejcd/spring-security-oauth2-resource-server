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
		   http.headers().frameOptions().disable();
	        http.authorizeRequests()
	                .antMatchers("/user").access("#oauth2.hasScope('read')"); // access token이 있어야 접근 가능
	              //  .anyRequest().authenticated();
    }
	
	
}
