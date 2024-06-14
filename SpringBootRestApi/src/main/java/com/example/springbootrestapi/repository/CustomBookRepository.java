package com.example.springbootrestapi.repository;
import com.example.springbootrestapi.demain.entity.Book;
public interface CustomBookRepository {
    Book customSave(Book book);
}