package com.training.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDao() {
		System.out.println("UserDao :: Constructors");
	}
	
	public void save() {
		System.out.println("Saving User record In Database.........");
	}

}
