package com.example.bookservice.dao;

import java.util.List;

import com.example.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
    @Query
    public List<Book> findByAuthorName(String authorName);

    @Query
    public Book createBook(Book book);
}