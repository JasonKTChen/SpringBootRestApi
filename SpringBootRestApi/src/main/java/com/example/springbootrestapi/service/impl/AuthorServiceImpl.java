package com.example.springbootrestapi.service.impl;

import com.example.springbootrestapi.demain.entity.Author;
import com.example.springbootrestapi.exception.ResourceNotFoundException;
import com.example.springbootrestapi.repository.AuthorRepository;
import com.example.springbootrestapi.repository.CustomAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl {
    private final AuthorRepository authorRepository;
    private final CustomAuthorRepository customAuthorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository, CustomAuthorRepository customAuthorRepository) {
        this.authorRepository = authorRepository;
        this.customAuthorRepository = customAuthorRepository;
    }

    public Author save(Author author) {
        return customAuthorRepository.customSave(author);
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public Author findById(Long id) {
        return authorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Author not found"));
    }

    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }
}


