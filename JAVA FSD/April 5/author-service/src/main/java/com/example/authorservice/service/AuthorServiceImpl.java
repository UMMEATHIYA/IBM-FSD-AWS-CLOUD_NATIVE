package com.example.authorservice.service;

import com.example.authorservice.dao.AuthorDao;
import com.example.authorservice.model.Author;
import com.example.authorservice.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorDao authorDao;

    @Autowired
    public AuthorServiceImpl(AuthorDao authorDao) {
        super();
        this.authorDao = authorDao;
    }

    @Override
    public List<Author> getAllAuthors() {
        // TODO Auto-generated method stub
        return authorDao.findAll();
    }


}