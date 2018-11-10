package com.example.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.spring5webapp.model.Author;
import com.example.spring5webapp.model.Book;
import com.example.spring5webapp.model.Publisher;
import com.example.spring5webapp.repositories.AuthorRepository;
import com.example.spring5webapp.repositories.BookRepository;
import com.example.spring5webapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRespository;
	
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRespository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRespository = publisherRespository;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
	}

	public void initData() {
		//Eric
		Author eric = new Author("Eric", "Evan");
		Publisher pub1 = new Publisher("Harper Collins");
		publisherRespository.save(pub1);
		Book ddd = new Book("Domain Driven Design", "1234", pub1);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		authorRepository.save(eric);
		bookRepository.save(ddd);
		
		
		//Rod
		Author rod = new Author("Rod", "Johnson");
		Publisher pub2 = new Publisher("Worx");
		publisherRespository.save(pub2);
		Book noEJB = new Book("J2EE Development without EJB", "23444", pub2);
		rod.getBooks().add(noEJB);
		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		
	}
}
