package com.tangcong.deal.service.impl;

import static com.tangcong.deal.support.AssertThrowUtil.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tangcong.deal.dao.UserDao;
import com.tangcong.deal.dto.UserContext;
import com.tangcong.deal.entity.UserEntity;
import com.tangcong.deal.service.UserService;
import com.tangcong.deal.support.ThisSystemException;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao udao;
	
	@Override
	
	public UserContext login(String account, String password, String ip) throws Exception {
		//1清理验证参数
		account=$("account不能为空",account);
		password=$("password不能为空",password);
		ip=$("ip不能为空",ip);
		//2执行业务逻辑
		//2.1通过账号查找用户
		UserEntity u=udao.select("account", account);
		//2.2如果用户不存在
		if(u==null)throw new ThisSystemException("账号和密码不匹配");
		//2.3判断密码是否正确
		if(!u.getPassword().equals(password)) {
			throw new ThisSystemException("账号和密码不匹配");
		}
		//2.4更新最后登陆ip
		u.setLastLoginIp(ip);
		udao.update(u);
		//3组装业务结果
		UserContext uc=new UserContext();
		uc.setId(u.getId());
		uc.setAccount(u.getAccount());
		uc.setPassword(u.getPassword());
		return uc;
	}
	
}
