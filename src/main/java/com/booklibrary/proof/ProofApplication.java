package com.booklibrary.proof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ProofApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProofApplication.class, args);

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class, AuthorConfig.class, PublisherConfig.class)) {
			Book printBook = context.getBean("printBook", Book.class);
			Book ebook = context.getBean("ebook", Book.class);

			System.out.println("--- Print Book ---");
			System.out.println("Title: " + printBook.getTitle());
			System.out.println("Author: " + printBook.getAuthor().getName());
			System.out.println("Publisher: " + printBook.getPublisher().getName());
			System.out.println("Type: " + printBook.getBookType());
			System.out.println();
			System.out.println("--- E-book ---");
			System.out.println("Title: " + ebook.getTitle());
			System.out.println("Author: " + ebook.getAuthor().getName());
			System.out.println("Publisher: " + ebook.getPublisher().getName());
			System.out.println("Type: " + ebook.getBookType());
		}
	}
}
