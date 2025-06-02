package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.dao.UserDao;
import com.training.util.EmailUtils;
import com.training.util.PwdUtils;

@Service
public class UserService {
	
	
	public UserService() {
		System.out.println("UserService :: Constructor");
	}

	private PwdUtils pwdUtils;

	private EmailUtils emailUtils;
	
	private UserDao  userDao;

	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Autowired
	public void setPwdUtils(PwdUtils pwdUtils) {
		this.pwdUtils = pwdUtils;
	}

	@Autowired
	public void setEmailUtils(EmailUtils emailUtils) {
		this.emailUtils = emailUtils;
	}

	public void registerUser() {	
		pwdUtils.encryptPwd();
		emailUtils.sendEmail();
		userDao.save();
		System.out.println("User Record Save Successfully....");

	}
}
