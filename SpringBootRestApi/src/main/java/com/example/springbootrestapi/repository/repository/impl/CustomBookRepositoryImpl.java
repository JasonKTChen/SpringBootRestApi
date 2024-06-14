package com.example.springbootrestapi.repository.repository.impl;

import com.example.springbootrestapi.domain.entity.Book;
import com.example.springbootrestapi.repository.CustomBookRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CustomBookRepositoryImpl implements CustomBookRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Book customSave(Book book) {
        if (book.getId() == null) {
            entityManager.persist(book);
            return book;
        } else {
            return entityManager.merge(book);
        }
    }
}