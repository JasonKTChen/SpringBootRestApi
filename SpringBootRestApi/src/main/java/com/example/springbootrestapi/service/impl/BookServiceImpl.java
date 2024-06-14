package com.example.springbootrestapi.service.impl;

import com.example.springbootrestapi.demain.entity.Book;
import com.example.springbootrestapi.exception.ResourceNotFoundException;
import com.example.springbootrestapi.repository.BookRepository;
import com.example.springbootrestapi.repository.CustomBookRepository;
import com.example.springbootrestapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final CustomBookRepository customBookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, CustomBookRepository customBookRepository) {
        this.bookRepository = bookRepository;
        this.customBookRepository = customBookRepository;
    }

    public Book save(Book book) {
        return customBookRepository.customSave(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book not found"));
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}