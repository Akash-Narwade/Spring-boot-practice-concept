package com.training.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.training.beans.IReport;

@Service
public class ReportService {

	private IReport report=null;

	public ReportService(@Qualifier("excel") IReport report) {
		System.out.println("ReportService :: Constructors");
		this.report = report;
	}

	public void generateReport() {
		report.generate();
		System.out.println("Report Generated Completed.....");
	}
}
