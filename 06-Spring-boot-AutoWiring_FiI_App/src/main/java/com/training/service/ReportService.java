package com.training.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.util.DateUtils;

@Service
public class ReportService {
	
	public ReportService() {
		System.out.println("ReportService :: Comstructors");
	}

	@Autowired
	private DateUtils du;

	public void generateReport() {
		LocalDate date = du.getDate();
		System.out.println("Report Generated Successfully For ::" + date);
	}
}
