package com.example.publicationservice.controller;

import java.util.List;

import com.example.publicationservice.model.Publication;
import com.example.publicationservice.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class PublicationController {

    private PublicationService publicationService;

    @Autowired
    public PublicationController(PublicationService publicationService) {
        super();
        this.publicationService = publicationService;
    }

    @GetMapping("/publication/{authorName}")
    public ResponseEntity<List<Publication>> findBooksByAuthorName(@PathVariable("authorName") String authorName) {
        return ResponseEntity.ok(publicationService.findByAuthorName(authorName));
    }
}