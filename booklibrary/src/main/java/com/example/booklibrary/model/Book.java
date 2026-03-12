/*
Date: 12th March 2026
Detail: Book class creation, including data fields required for an instance of Book in the library.

*/
package com.example.booklibrary.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String isbn;

    @Column(length=1000)
    private String description;

    private boolean read;

    public Book() {}

    // Init book with given values
    public Book (String title, String author, String isbn, String description, boolean read) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.description = description;
        this.read = read;
    }

    // Getters and setters
    public Long getID() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor () {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getDescription() {
        return description;
    }
    public boolean getRead() {
        return read;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setRead(boolean read) {
        this.read = read;
    }
}
