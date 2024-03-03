package com.booklibrary.proof;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PublisherConfig {
    @Bean
    public Publisher springPublishingHouse() {
        Publisher publisher = new Publisher();
        publisher.setName("Spring Publishing House");
        publisher.setAddress("123 Spring St.");
        publisher.setFoundedYear("2000");
        return publisher;
    }
}