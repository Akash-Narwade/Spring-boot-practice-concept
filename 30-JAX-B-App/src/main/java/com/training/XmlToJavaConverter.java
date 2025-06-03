package com.training;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToJavaConverter {
	
	public static void main(String[] args) throws JAXBException {
		 JAXBContext context = JAXBContext.newInstance(Book.class);
		 Unmarshaller unmarshaller = context.createUnmarshaller();
		 Object object = unmarshaller.unmarshal(new File("Book.xml"));
		 Book b= (Book)object;
		 System.out.println(b);
	}
   
}
