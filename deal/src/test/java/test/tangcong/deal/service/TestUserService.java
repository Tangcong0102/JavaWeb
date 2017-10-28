package test.tangcong.deal.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tangcong.deal.dto.UserContext;
import com.tangcong.deal.service.UserService;

import oracle.net.aso.s;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-service.xml","classpath:spring-dao.xml"})
public class TestUserService {
	@Autowired
	UserService service;
	
	@Test
	public void testLogin()throws Exception {
		String account="system";
		String password="admin";
		String ip="127.0.0.1";
		UserContext uc=service.login(account, password, ip);
		assertNotNull("登陆失败",uc);
	}

}
