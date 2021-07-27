package com.example.BooksCrud.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BooksCrud.repository.BooksRepository;
import com.example.BooksCrud.domain.Books;


@Service
public class BooksService {
	
	@Autowired
    private BooksRepository repo;
	
	public List<Books> listAll() {
        return repo.findAll();
    }
     
    public void save(Books std) {
        repo.save(std);
    }
     
    public Books get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}