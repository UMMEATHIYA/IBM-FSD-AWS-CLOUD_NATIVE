package com.example.authorservice.controller;

import com.example.authorservice.model.Author;
import com.example.authorservice.model.Book;
import com.example.authorservice.model.Publication;
import com.example.authorservice.proxy.BookProxy;
import com.example.authorservice.proxy.PublicationProxy;
import com.example.authorservice.service.AuthorService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    private AuthorService authorService;
    private BookProxy bookProxy;
    private PublicationProxy publicationProxy;

    @Autowired
    public AuthorController(AuthorService authorService, BookProxy bookProxy,PublicationProxy publicationProxy) {
        super();
        this.authorService = authorService;
        this.bookProxy = bookProxy;
        this.publicationProxy = publicationProxy;
    }

    @GetMapping("/authors")
    public ResponseEntity<List<Author>> getAllAuthors() {
        return ResponseEntity.ok(authorService.getAllAuthors());
    }

    @GetMapping("/authors/{authorName}")
    @HystrixCommand(fallbackMethod = "myFallBack")
    public ResponseEntity<?> getAllBooksByAuthor(@PathVariable("authorName") String authorName) {

        return bookProxy.findBooksByAuthor(authorName);
    }

    public ResponseEntity<?> myFallBack(@PathVariable("authorName") String authorName)
    {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("book-service is down.");
    }

    
    @GetMapping("/authors/publication/{authorName}")
    @HystrixCommand(fallbackMethod = "myFallBack1")
    public ResponseEntity<?> getAllBooksByAuthor1(@PathVariable("authorName") String authorName) {

        return publicationProxy.findBooksByAuthors(authorName);
    }

    public ResponseEntity<?> myFallBack1(@PathVariable("authorName") String authorName)
    {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("publication-service is down.");
    }


}
