package com.example.authorservice.proxy;

import com.example.authorservice.model.Publication;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@FeignClient(name = "publication-service")
public interface PublicationProxy {
    @GetMapping("/publication/{authorName}")
    public ResponseEntity<List<Publication>> findBooksByAuthors(@PathVariable("authorName") String authorName);



}
