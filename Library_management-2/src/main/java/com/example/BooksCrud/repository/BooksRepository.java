package com.example.BooksCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BooksCrud.domain.Books;


@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {

}