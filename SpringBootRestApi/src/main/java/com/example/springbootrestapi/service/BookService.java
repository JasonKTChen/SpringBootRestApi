package com.example.springbootrestapi.service;

import com.example.springbootrestapi.domain.entity.Book;

import java.util.List;
public interface BookService {

    Book save(Book book);
    List<Book> findAll();
    Book findById(Long id);
    void deleteById(Long id);
}
