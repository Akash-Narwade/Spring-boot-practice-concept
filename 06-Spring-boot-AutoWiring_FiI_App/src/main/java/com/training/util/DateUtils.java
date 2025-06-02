package com.training.util;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class DateUtils {

	public DateUtils() {
		System.out.println("DateUtils :: Constructors");
	}

	public LocalDate getDate() {
		LocalDate now = LocalDate.now(); 
		return now;

	}
}
