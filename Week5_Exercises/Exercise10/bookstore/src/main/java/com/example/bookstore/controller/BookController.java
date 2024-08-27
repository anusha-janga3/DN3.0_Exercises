package com.example.bookstore.controller;


import com.example.bookstore.model.Book;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping(value = "/books", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Book getBook() {
        return new Book(1L, "Spring in Action", "Craig Walls");
    }
}

