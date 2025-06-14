package com.training.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.bindings.Book;

@RestController
public class BookRestController {

	@GetMapping(value = "/books/{isbn}", produces = "application/json")
	public Book getBookInfo(@PathVariable("isbn") String isbn) {
		// logic
		Book b = new Book(isbn, "Spring", 300.00, "Rod Johnson");

		Link withRel = WebMvcLinkBuilder.linkTo(
				WebMvcLinkBuilder.methodOn(BookRestController.class)
				.getAllbooks())
				.withRel("All-Books");

		b.add(withRel);
		return b;

	}

	@GetMapping(value = "/books", produces = "application/json")
	public List<Book> getAllbooks() {

		Book b1 = new Book("ISBN001", "Spring", 300.00, "Rod Johnson");
		Book b2 = new Book("ISBN002", "Spring Boot", 400.00, "Rod Johnson");
		Book b3 = new Book("ISBN003", "Spring Cloud", 200.00, "Rod Johnson");

		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);

		return books;
	}

}
