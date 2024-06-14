package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.domain.entity.Author;

public interface CustomAuthorRepository {
    Author customSave(Author author);
}