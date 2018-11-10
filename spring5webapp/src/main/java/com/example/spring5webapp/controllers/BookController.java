package com.example.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring5webapp.repositories.BookRepository;

@Controller
public class BookController {
	
	private BookRepository bookRespository;
	public BookController(BookRepository bookRespository) {
		this.bookRespository = bookRespository;
		
	}
	
	@RequestMapping("/books")
	public String getBooks(Model model) {
		
		model.addAttribute("books", bookRespository.findAll());
		
		return "books";
	}
}
