package com.training.beans;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReport implements IReport {

	public PdfReport() {
		System.out.println("PDfReport  : Constructor ");
	}

	@Override
	public void generate() {
		System.out.println("PDF Report Generating....");

	}

}
