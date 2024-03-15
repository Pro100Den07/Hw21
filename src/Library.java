import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author, int year, String isbn) throws LibraryException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                throw new LibraryException(LibraryErrorType.DUPLICATE_BOOK, "A book with this ISBN already exists in the library");
            }
        }
        if (year < 0 || year > 2023) {
            throw new LibraryException(LibraryErrorType.INVALID_YEAR, "Invalid publication year");
        }
        books.add(new Book(title, author, year, isbn));
    }

    public void removeBook(String isbn) throws LibraryException {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove == null) {
            throw new LibraryException(LibraryErrorType.BOOK_NOT_FOUND, "The book with the specified ISBN does not exist in the library");
        }
        books.remove(bookToRemove);
    }

    public Book findBookByIsbn(String isbn) throws LibraryException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new LibraryException(LibraryErrorType.BOOK_NOT_FOUND, "The book with the specified ISBN does not exist in the library");
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBooksByYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.addBook("A Thousand Wonders", "Author1", 2000, "1234567890");
            library.addBook("Adventures", "Author2", 1995, "2345678901");
            library.addBook("Poems", "Author1", 2010, "3456789012");

            System.out.println(library.findBooksByAuthor("Author1"));
            System.out.println(library.findBooksByYear(1995));
            System.out.println(library.findBookByIsbn("1234567890"));

            library.removeBook("2345678901");
            System.out.println(library.findBooksByAuthor("Author2"));
        } catch (LibraryException e) {
            e.printStackTrace();
        }
    }
}

class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
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

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

class LibraryException extends Exception {
    private LibraryErrorType errorType;

    public LibraryException(LibraryErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public LibraryErrorType getErrorType() {
        return errorType;
    }
}

enum LibraryErrorType {
    DUPLICATE_BOOK,
    INVALID_YEAR,
    BOOK_NOT_FOUND
}