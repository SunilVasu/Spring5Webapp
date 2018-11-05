package com.example.spring5webapp.modal.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spring5webapp.modal.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
