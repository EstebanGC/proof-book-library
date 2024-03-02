package com.booklibrary.proof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BookConfig {

    @Autowired
    private Author author;

    @Autowired
    private Publisher publisher;

    @Bean(name = "printBook")
    public Book printBook() {
        return new Book("The adventures of Spring(Print Edition)", author, publisher,  "Print");
    }

    @Bean(name = "ebook")
    public Book ebook() {
        return new Book("The Adventures of Spring(E-book Edition)", author, publisher, "E-book");
    }
}

