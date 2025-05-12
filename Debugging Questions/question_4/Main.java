import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Book 1", "Author 1", 10.99);
        Book book2 = new Book("Book 2", "Author 2", 20.99);
        Book book3 = new Book("Book 3", "Author 1", 15.99);
        try {
            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }

        List<Book> booksByAuthor = library.getBooksByAuthor("Author 1");
        List<Book> booksByPriceRange = library.getBooksByPriceRange(10.00, 20.00);

        System.out.println("Books by Author 1:");
        for (Book book : booksByAuthor) {
            System.out.println(book.getTitle());
        }

        System.out.println("Books by Price Range (10.00 - 20.00):");
        for (Book book : booksByPriceRange) {
            System.out.println(book.getTitle());
        }
    }
}