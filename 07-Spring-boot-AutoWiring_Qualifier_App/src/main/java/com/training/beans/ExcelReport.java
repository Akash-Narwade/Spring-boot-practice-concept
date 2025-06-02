package com.training.beans;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReport implements IReport {

	public ExcelReport() {
		System.out.println("ExcelReport :: Constructed");
	}

	@Override
	public void generate() {
		System.out.println("Excel Report Generated");
	}

}
