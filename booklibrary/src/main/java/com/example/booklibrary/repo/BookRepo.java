/*
Date: 12th March 2026
Detail: Create an interface using SpringBoot JPA; sort Book objects by their ID, allowing them to be
saved, searched and deleted.
*/
package com.example.booklibrary.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booklibrary.model.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

}
