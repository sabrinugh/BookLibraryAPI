/*
Date: 12th March 2026
Detail: Implement functionality provided by SpringBoot JPA repository interface, created by BookRepo.java
*/
package com.example.booklibrary.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.repo.BookRepo;

@Service
public class BookService {
    private final BookRepo repo;

    public BookService (BookRepo repo) {
        this.repo = repo;
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book getBookById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Book createBook(Book book) {
        return repo.save(book);
    }

    
    public Book BookUpdate (Long id, Book updatedBook) {
        Book book = repo.findById(id).orElseThrow();

        book.setTitle(updatedBook.getTitle());
        book.setAuthor(updatedBook.getAuthor());
        book.setDescription(updatedBook.getDescription());
        book.setIsbn(updatedBook.getIsbn());
        book.setRead(updatedBook.getRead());

        return repo.save(book);
    }

    // Delete book based on its ID
    public void deleteBook(Long id) {
        repo.deleteById(id);
    }

}
