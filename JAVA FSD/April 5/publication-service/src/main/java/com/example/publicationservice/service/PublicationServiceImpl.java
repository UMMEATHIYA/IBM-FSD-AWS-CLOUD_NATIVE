package com.example.publicationservice.service;

import java.util.List;


import com.example.publicationservice.dao.PublicationDao;
import com.example.publicationservice.model.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PublicationServiceImpl implements PublicationService{

    private PublicationDao publicationDao;

    @Autowired
    public PublicationServiceImpl(PublicationDao publicationDao) {
        super();
        this.publicationDao = publicationDao;
    }


    @Override
    public List<Publication> findByAuthorName(String authorName) {
        // TODO Auto-generated method stub
        return publicationDao.findByAuthorName(authorName);
    }


}