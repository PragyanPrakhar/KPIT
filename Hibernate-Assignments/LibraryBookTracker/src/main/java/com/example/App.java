package com.example;

import com.example.model.Author;
import com.example.model.Book;

public class App {
    public static void main(String[] args) {
        // Create an author
        Author author = new Author("J.K. Rowling");

        // Add books to the author
        author.addBook(new Book("Harry Potter and the Philosopher's Stone"));
        author.addBook(new Book("Harry Potter and the Chamber of Secrets"));

        // Save author and books to database
        AuthorService.saveAuthor(author);

        System.out.println("Author and books saved successfully!");
    }
}
