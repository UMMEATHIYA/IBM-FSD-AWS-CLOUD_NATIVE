package com.example.bookservice;


import com.example.bookservice.dao.BookDao;
import com.example.bookservice.model.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class BookServiceApplication implements CommandLineRunner{

    private BookDao bookDao;


    public BookServiceApplication(BookDao bookDao) {
        super();
        this.bookDao = bookDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bookDao.save(new Book(1, "Pro Spring", 10, "auth-1"));
        bookDao.save(new Book(2, "Pro Hibernate", 11, "auth-2"));
    }
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.example.bookservice")).build();
    }
}
