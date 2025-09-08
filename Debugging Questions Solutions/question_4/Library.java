import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        boolean duplicateExists = books.stream().anyMatch(b -> b.getTitle().equalsIgnoreCase(book.getTitle())
                && b.getAuthor().equalsIgnoreCase(book.getAuthor()));

        if (duplicateExists) {
            throw new IllegalArgumentException("Book with the same title and author already exists.");
        }

        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> getBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public List<Book> getBooksByPriceRange(double minPrice, double maxPrice) {
        return books.stream()
                .filter(book -> book.getPrice() >= minPrice && book.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}