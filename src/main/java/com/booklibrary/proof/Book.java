package com.booklibrary.proof;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String title;
    private Author author;
    private Publisher publisher;
    private String type;

    public Book(Author author, Publisher publisher) {
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getBookType() {
        return type;
    }

    public String getType() {
        return type;
    }

    public void setBookType(String type) {
        this.type = type;
    }
}
