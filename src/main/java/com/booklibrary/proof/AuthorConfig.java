package com.booklibrary.proof;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorConfig {
    @Bean
    public Author johnDoe() {
        return new Author("John Doe");
    }
}