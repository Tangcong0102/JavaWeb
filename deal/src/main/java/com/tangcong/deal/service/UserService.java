package com.tangcong.deal.service;

import org.springframework.transaction.annotation.Transactional;

import com.tangcong.deal.dto.UserContext;
@Transactional
public interface UserService {

	public UserContext login(String account,String password,String ip)throws Exception;
}

