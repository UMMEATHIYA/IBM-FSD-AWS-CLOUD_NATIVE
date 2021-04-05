package com.example.publicationservice.dao;

import java.util.List;


import com.example.publicationservice.model.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PublicationDao extends JpaRepository<Publication, Integer> {
    @Query
    public List<Publication> findByAuthorName(String authorName);


}