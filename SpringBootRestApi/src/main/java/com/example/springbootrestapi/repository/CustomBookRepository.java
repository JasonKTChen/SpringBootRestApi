package com.example.springbootrestapi.repository;
import com.example.springbootrestapi.domain.entity.Book;
public interface CustomBookRepository {
    Book customSave(Book book);
}