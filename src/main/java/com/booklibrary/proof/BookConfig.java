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
        Book book = new Book(johnDoe, springPublishingHouse);
        book.setTitle("The adventures of Spring(Print Edition)");
        book.setBookType("Print");
        return book;
    }

    @Bean(name = "ebook")
    public Book ebook() {
        Book book = new Book( johnDoe, springPublishingHouse);
        book.setTitle("The Adventures of Spring(E-book Edition)");
        book.setBookType("E-book");
        return book;
    }
}

