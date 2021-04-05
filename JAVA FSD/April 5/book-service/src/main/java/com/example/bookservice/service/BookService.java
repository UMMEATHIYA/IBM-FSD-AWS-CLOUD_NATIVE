package com.example.bookservice.service;

import com.example.bookservice.model.Book;

import java.util.List;


public interface BookService {
    public List<Book> findByAuthorName(String authorName);


}