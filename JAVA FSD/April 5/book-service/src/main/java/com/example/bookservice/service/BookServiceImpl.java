package com.example.bookservice.service;

import java.util.List;

import com.example.bookservice.dao.BookDao;
import com.example.bookservice.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService{

    private BookDao bookDao;

    @Autowired
    public BookServiceImpl(BookDao bookDao) {
        super();
        this.bookDao = bookDao;
    }


    @Override
    public List<Book> findByAuthorName(String authorName) {
        // TODO Auto-generated method stub
        return bookDao.findByAuthorName(authorName);
    }

}