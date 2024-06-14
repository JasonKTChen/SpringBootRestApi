package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.demain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
}