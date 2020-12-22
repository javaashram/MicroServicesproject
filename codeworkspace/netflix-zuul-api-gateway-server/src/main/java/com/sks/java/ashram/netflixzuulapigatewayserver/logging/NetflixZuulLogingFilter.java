package com.sks.java.ashram.netflixzuulapigatewayserver.logging;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class NetflixZuulLogingFilter extends ZuulFilter{

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		
		System.out.println("*******Logging filter started working***************");
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		
		logger.info("request is = {} and request uri is {}", request, request.getRequestURI());
		
		System.out.println("*******Logging filter srun execution completed......");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1; //Setting filter order to 1
	}

}
