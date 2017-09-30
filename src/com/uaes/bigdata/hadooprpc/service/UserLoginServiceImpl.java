package com.uaes.bigdata.hadooprpc.service;

import com.uaes.bigdata.hadooprpc.protocol.IUserLoginService;

public class UserLoginServiceImpl implements IUserLoginService{

	@Override
	public String login(String name, String passwd) {
		
		return name + "logged in successfully...";
	}
	
	
	

}
