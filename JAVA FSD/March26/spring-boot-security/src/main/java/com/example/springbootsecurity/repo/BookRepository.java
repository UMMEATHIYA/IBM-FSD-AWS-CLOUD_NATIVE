package com.example.springbootsecurity.repo;

import com.example.springbootsecurity.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
