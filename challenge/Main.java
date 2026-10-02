public class Main {
    public static void main(String[] args) {
        Author author = new Author("Gabriel García Márquez");

        // Probando addBook con título y precio
        author.addBook("Cien años de soledad", 45.0);

        // Probando addBook con un objeto Book existente
        Book book2 = new Book("El coronel no tiene quien le escriba", author, 30.0);
        author.addBook(book2);

        System.out.println("Autor: " + author.getName());
        System.out.println("Libros escritos:");
        for (Book b : author.getBooks()) {
            b.getInfo();
            System.out.println("--------------------");
        }
    }
}