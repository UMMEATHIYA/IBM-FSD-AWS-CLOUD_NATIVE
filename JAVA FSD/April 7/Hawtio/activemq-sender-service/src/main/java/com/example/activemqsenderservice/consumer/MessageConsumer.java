package com.example.activemqsenderservice.consumer;

import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
        org.springframework.jms.annotation.EnableJms; import
        org.springframework.jms.annotation.JmsListener; import
        org.springframework.stereotype.Component;

@Component

@EnableJms public class MessageConsumer {

    private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "test-queue") public void listener(String
                                                                          message){ System.out.println("Message Received: "+message); }

    @JmsListener(destination = "customer-queue") public void listener1(Object
                                                                               message){ System.out.println("Message received: "+message); }

}