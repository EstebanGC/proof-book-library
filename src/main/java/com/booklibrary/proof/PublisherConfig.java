package com.booklibrary.proof;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PublisherConfig {
    @Bean
    public Publisher springPublishingHouse() {
        return new Publisher("Spring Publishing House", "123 Spring St.", "2000");
    }
}