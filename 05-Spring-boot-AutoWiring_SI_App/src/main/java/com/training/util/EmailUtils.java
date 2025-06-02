package com.training.util;

import org.springframework.stereotype.Component;

@Component
public class EmailUtils {
	public EmailUtils() {
		System.out.println("EmailUtils :: Constructor");
	}

	public void sendEmail() {
		System.out.println("send Email for Register User");
	}


}


