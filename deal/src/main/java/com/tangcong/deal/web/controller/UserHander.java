package com.tangcong.deal.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.tangcong.deal.dto.UserContext;
import com.tangcong.deal.service.UserService;
import com.tangcong.deal.support.ThisSystemException;

@Controller
@RequestMapping("/user")
@SessionAttributes("currentUser")
public class UserHander {
	@Autowired
	UserService service;
	@PostMapping("/login.do")
	public ModelAndView login(String account,String password,HttpServletRequest req)throws Exception{
		//1调用业务层方法
		ModelAndView mav=new ModelAndView();
		System.out.println(account);
		
		try {
			String ip=req.getRemoteHost();
			UserContext uc= service.login(account, password, ip);
			mav.addObject("currentUser",uc);
			mav.setViewName("redirect:/view/index.jsp");
		}catch(ThisSystemException e) {
			mav.addObject("message",e.getMessage());
			mav.setViewName("forward:/login.jsp");
		}
		//2确认视图和模型
		return mav;
	}
	
}
