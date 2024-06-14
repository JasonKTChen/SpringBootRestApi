package com.example.springbootrestapi.repository.repository.impl;

import com.example.springbootrestapi.domain.entity.Author;
import com.example.springbootrestapi.repository.CustomAuthorRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CustomAuthorRepositoryImpl implements CustomAuthorRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Author customSave(Author author) {
        if (author.getId() == null) {
            entityManager.persist(author);
            return author;
        } else {
            return entityManager.merge(author);
        }
    }
}