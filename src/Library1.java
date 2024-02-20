import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public static int countBooksInLibrary(Library library) {
        return library.books.size();
    }
}
public class Library1 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("451 degrees Fahrenheit", "Ray Bradbury", 1960);

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Total books in library: " + Library.countBooksInLibrary(library));

        List<Book> booksByAuthor = library.searchByAuthor("Ray Bradbury");
        for (Book book : booksByAuthor) {
            System.out.println("Book by Ray Bradbury: " + book.getTitle());
        }
    }
}