package com.tangcong.deal.web.controller.config;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AllControllerConfig {

	@ExceptionHandler
	public void handlerException(Exception e,HttpServletResponse resp)throws Exception {
		System.out.println("AllControllerConfig.handlerException()");
		resp.sendError(500);
		
	}
	
}
