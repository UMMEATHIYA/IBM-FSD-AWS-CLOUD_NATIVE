package com.example.activemqsenderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.jms.Queue;

@RestController
@RequestMapping("/api")
public class MessageController {
    private Queue queue;
    private JmsTemplate jmsTemplate;

    @Autowired
    public MessageController(Queue queue, JmsTemplate jmsTemplate) {
        super();
        this.queue = queue;
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping("/message/{message}")
    public ResponseEntity<String> publishMessage(@PathVariable("message") final String message) {
        jmsTemplate.convertAndSend(queue, message);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(message);
    }

}