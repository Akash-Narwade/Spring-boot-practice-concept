package com.training;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class JavaToXmlConverter {
/**
 * 
 * @param args
 * @throws JsonProcessingException
 * @throws JAXBException 
 */
	public static void main(String[] args) throws JAXBException {
		com.training.Book book = new Book();
		book.setBookId(101);
		book.setBookName("Spring");
		book.setBookPrice(450.00);
		
		
		// Convert Book Data To XMl
		JAXBContext context = JAXBContext.newInstance(com.training.Book.class);
		Marshaller marshaller= context.createMarshaller();
		marshaller.marshal(book, System.out);
	}
}
