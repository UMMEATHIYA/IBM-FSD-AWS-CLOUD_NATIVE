package com.example.publicationservice;


import com.example.publicationservice.dao.PublicationDao;
import com.example.publicationservice.model.Publication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
public class PublicationServiceApplication implements CommandLineRunner{

    private PublicationDao publicationDao;


    public PublicationServiceApplication(PublicationDao publicationDao) {
        super();
        this.publicationDao = publicationDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(PublicationServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        publicationDao.save(new Publication(1,"Selina","Pro Spring","auth-1"));
        publicationDao.save(new Publication(2,"SAM","Pro Hibernate","auth-2"));
    }

}
