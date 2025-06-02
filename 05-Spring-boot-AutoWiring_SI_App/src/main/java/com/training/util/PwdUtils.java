package com.training.util;

import org.springframework.stereotype.Component;

@Component
public class PwdUtils {
	public PwdUtils() {
		System.out.println("PwdUtils :: Constructors");
	}

	public void encryptPwd() {
		System.out.println("Encrypting Pwd For Register User.....");
	}
}
