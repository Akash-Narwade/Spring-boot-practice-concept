package com.training;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {
/**
 * 
 * @param args
 * @throws JsonProcessingException
 */
	public static void main(String[] args) throws JsonProcessingException {
		Book book = new Book();

		book.setBookId(101);
		//book.setBookName("Spring");
		book.setBookPrice(450.00);
		// Convert Book Data To JSON

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter()
				            .writeValueAsString(book);
		System.out.println(json);
	}
}
