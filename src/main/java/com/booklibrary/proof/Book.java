package com.booklibrary.proof;

public class Book {
    private String title;
    private Author author;
    private Publisher publisher;
    private String type;

    public Book(String title, Author author, Publisher publisher, String type) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
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

    public void setBookType(String type) {
        this.type = type;
    }
}
