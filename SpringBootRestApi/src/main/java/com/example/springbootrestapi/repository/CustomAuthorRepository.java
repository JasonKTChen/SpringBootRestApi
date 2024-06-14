package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.demain.entity.Author;

public interface CustomAuthorRepository {
    Author customSave(Author author);
}