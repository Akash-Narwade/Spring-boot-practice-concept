package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.dao.UserDao;


@Service
public class UserService {
	
      private UserDao userDao=null;
      
      @Autowired
      public UserService(UserDao userDao) {
    	  System.out.println("UserService :: 1--Constructor");
		this.userDao= userDao;
	}
    
      public UserService() {
    	  System.out.println("UserService :: 1--Constructor");
	}
      
      
      public void  registerUser() {
    	  boolean isSaved=userDao.saveUser("Akash", "akash.narwade@gmail.com", "Akash@123");
    	  
    	  if(isSaved) {
    		  System.out.println("Record Save Successfully");
    	  }
    	  else {
    		  System.out.println("Failed to Save record");
    	  }
      }
}
