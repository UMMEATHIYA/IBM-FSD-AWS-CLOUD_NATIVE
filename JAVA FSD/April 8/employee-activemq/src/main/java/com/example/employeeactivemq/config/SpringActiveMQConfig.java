package com.example.employeeactivemq.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Queue;

@Configuration
@EnableJms
public class SpringActiveMQConfig {

    @Value("tcp://LAPTOP-MIEEM8GE:61616")
    private String brokerUrl;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("employee-queue");
    }


}