import java.util.ArrayList;
import java.util.Iterator;

class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}

class Library {
    ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(String title) {
        Iterator<Book> iterator = this.books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.title.equals(title)) {
                iterator.remove();
                break;
            }
        }
    }

    public void printBooks() {
        for (Book book : this.books) {
            System.out.println("Title: " + book.title + ", Author: " + book.author + ", Publication Year: " + book.publicationYear);
        }
    }
}

public class HwBook {
    public static void main(String[] args) {
        Book book1 = new Book("Book name 1", "Author1", 2000);
        Book book2 = new Book("Book name 2", "Author 2", 2010);
        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("List of Books in library:");
        library.printBooks();

        library.removeBook("Book name 1");

        System.out.println("List of Books in library after publication:");
        library.printBooks();
    }
}