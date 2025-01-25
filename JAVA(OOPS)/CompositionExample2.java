import java.util.*;

class Book {
    public String title;
    public String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    private List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getListOfBooksInLibrary() {
        return books;
    }
}

public class CompositionExample2 {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "James Gosling");
        Book b2 = new Book("C++", "Bjarne Stroustrup");
        Book b3 = new Book("Python", "Guido van Rossum");
        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        Library library = new Library(books);
        List<Book> booksInLibrary = library.getListOfBooksInLibrary();
        for (Book book : booksInLibrary) {
            System.out.println("Title: " + book.title + " Author: " + book.author);
        }
    }
}
