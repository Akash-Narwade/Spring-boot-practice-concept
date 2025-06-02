package com.training.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public UserDao() {
		System.out.println("UserDao :: Constructor");
	}
	
	public boolean saveUser(String name,String email,String pwd) {
		//logic to Store in data base
		 System.out.println("Storing Data in Database");
		 return true;
	}

}
