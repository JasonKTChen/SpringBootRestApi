package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.domain.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long>{}
