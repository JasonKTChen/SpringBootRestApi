package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.demain.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long>{}
