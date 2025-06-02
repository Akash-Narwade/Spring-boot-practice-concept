package com.training.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("I am From Command Line Runners");
		
	}

}
