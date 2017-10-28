package com.tangcong.deal.entity;

import java.io.Serializable;

public class UserEntity implements Serializable{
	
	private static final long serialVersionUID = 6616789868622590637L;
	
	private String id;
	private String account;
	private String lastLoginIp;
	public String getLastLoginIp() {
		return lastLoginIp;
	}
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
