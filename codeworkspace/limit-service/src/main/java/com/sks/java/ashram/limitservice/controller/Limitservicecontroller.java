package com.sks.java.ashram.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sks.java.ashram.limitservice.configuration.Configuration;
import com.sks.java.ashram.limitservice.model.Limitserviceconfiguration;

@RestController
@RefreshScope
public class Limitservicecontroller {
	
	@Autowired
	private Configuration configuration;
	
	
	@GetMapping("limit-service")
	@HystrixCommand(fallbackMethod = "reliable")
	public Limitserviceconfiguration retievelimitconfiguration()
	{
		
		return new Limitserviceconfiguration(configuration.getMinimum(),configuration.getMaximum());
	}
	
	@GetMapping("limit-service-hystrix")
	@HystrixCommand(fallbackMethod = "reliable")
	public Limitserviceconfiguration retievelimitexchangeconfiguration()
	{
		
		 throw new RuntimeException("****Service Error Exception********");
	}
	
	public Limitserviceconfiguration reliable() {
		return new Limitserviceconfiguration(1,1);
	}
		
}
