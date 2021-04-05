package com.example.bookservice.controller;

import java.util.List;

import com.example.bookservice.model.Book;
import com.example.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }

    @GetMapping("/books/{authorName}")
    public ResponseEntity<List<Book>> findBooksByAuthorName(@PathVariable("authorName") String authorName)
    {
        return ResponseEntity.ok(bookService.findByAuthorName(authorName));
    }

 

}