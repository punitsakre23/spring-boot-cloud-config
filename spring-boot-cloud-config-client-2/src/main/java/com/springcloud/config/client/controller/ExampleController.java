package com.springcloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

public class ExampleController {
	
	@Value("${my.appName}")
	private String appName;
	
	@GetMapping("/appName")
	public String appName() {
		return appName;
	}

}
