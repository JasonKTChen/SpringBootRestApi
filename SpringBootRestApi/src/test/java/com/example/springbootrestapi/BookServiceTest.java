package com.example.springbootrestapi;

import com.example.springbootrestapi.demain.entity.Book;
import com.example.springbootrestapi.exception.ResourceNotFoundException;
import com.example.springbootrestapi.repository.BookRepository;
import com.example.springbootrestapi.repository.CustomBookRepository;
import com.example.springbootrestapi.service.BookService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {
    @Mock
    private BookRepository bookRepository;

    @Mock
    private CustomBookRepository customBookRepository;

    @InjectMocks
    private BookService bookService;

    private Book book;

    private static final Logger logger = LoggerFactory.getLogger(BookServiceTest.class);

    @Before
    public void setUp() {
        book = new Book();
        book.setId(1L);
        book.setTitle("Test Book");
    }

    @Test
    public void testSaveBook() {
        when(customBookRepository.customSave(any(Book.class))).thenReturn(book);

        Book savedBook = bookService.save(book);

        assertNotNull(savedBook);
        assertEquals("Test Book", savedBook.getTitle());
        verify(customBookRepository, times(1)).customSave(book);

        logger.info("Verified customSave method was called once with provided book.");

    }

    @Test
    public void testFindAllBooks() {
        when(bookRepository.findAll()).thenReturn(Collections.singletonList(book));

        List<Book> books = bookService.findAll();

        assertNotNull(books);
        assertEquals(1, books.size());
        verify(bookRepository, times(1)).findAll();

        logger.info("Verified findAll method was called once.");

    }

    @Test
    public void testFindBookById() {
        when(bookRepository.findById(1L)).thenReturn(Optional.of(book));

        Book foundBook = bookService.findById(1L);

        assertNotNull(foundBook);
        assertEquals("Test Book", foundBook.getTitle());
        verify(bookRepository, times(1)).findById(1L);

        logger.info("Verified findById method was called once with ID 1.");

    }

    @Test(expected = ResourceNotFoundException.class)
    public void testFindBookByIdNotFound() {
        when(bookRepository.findById(1L)).thenReturn(Optional.empty());

        bookService.findById(1L);
    }

    @Test
    public void testDeleteBookById() {
        bookService.deleteById(1L);

        verify(bookRepository, times(1)).deleteById(1L);

        logger.info("Verified deleteById method was called once with ID 1.");


    }
}
