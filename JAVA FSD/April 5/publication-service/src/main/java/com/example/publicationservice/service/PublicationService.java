package com.example.publicationservice.service;

import com.example.publicationservice.model.Publication;

import java.util.List;


public interface PublicationService{
    public List<Publication> findByAuthorName(String authorName);

}