package com.example.springbootrestapi.service;

import com.example.springbootrestapi.demain.entity.Author;

import java.util.List;

public interface AuthorService {

    Author save(Author author);
    List<Author> findAll();
    Author findById(Long id);
    void deleteById(Long id);
}
