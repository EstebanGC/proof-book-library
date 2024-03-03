package com.booklibrary.proof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Autowired
    private Author johnDoe;

    @Autowired
    private Publisher springPublishingHouse;

    @Bean(name = "printBook")
    public Book printBook() {
        return new Book( johnDoe, springPublishingHouse);
    }

    @Bean(name = "ebook")
    public Book ebook() {
        return new Book( johnDoe, springPublishingHouse);
    }
}

