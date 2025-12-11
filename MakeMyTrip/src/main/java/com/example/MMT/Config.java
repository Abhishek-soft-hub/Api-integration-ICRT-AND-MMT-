package com.example.MMT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

	@Bean
	public RestTemplate getRestTemplate(){
		RestTemplate rest = new RestTemplate();
		return rest;
	}
}
