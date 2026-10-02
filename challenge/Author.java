import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Sobrecarga de método addBook para aceptar un objeto Book completo
    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    // Sobrecarga de método addBook para aceptar título y precio (crea el libro automáticamente)
    public void addBook(String title, double price) {
        Book newBook = new Book(title, this, price);
        if (!books.contains(newBook)) {
            books.add(newBook);
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }
}