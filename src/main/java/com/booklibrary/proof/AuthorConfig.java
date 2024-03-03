package com.booklibrary.proof;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorConfig {
    @Bean
    public Author johnDoe() {
        Author author = new Author();
        author.setName("John Doe");
        return author;
    }
}