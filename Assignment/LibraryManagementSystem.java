// Implement a Java program for a library management system. 
// Design classes for Book, Library, and Member.
//  Each Book should have a unique ISBN, title, author, and availability status. 
//  The library should maintain a collection of Books and handle operations such as adding a new Book, 
//  removing a Book, and displaying all Books. Members should have a unique ID, name, and a list of Books
//   they have borrowed. Your program should allow users to perform the following actions: 
//   1. Add a new Book to the Library. 2. Remove a Book from the Library. 3. Display all Books in the Library.

import java.util.*;

class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean available;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Available: " + available;
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

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

class Member {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println(name + " has borrowed " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available");
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setAvailable(true);
        System.out.println(name + " has returned " + book.getTitle());
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

     
        Book book1 = new Book("978-0134685991", "Clean Code", "Robert C. Martin");
        Book book2 = new Book("978-0321125217", "Effective Java", "Joshua Bloch");
        Book book3 = new Book("978-0596009205", "Head First Design Patterns", "Eric Freeman");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Books in the library:");
        library.displayBooks();

     
        library.removeBook(book2);
        System.out.println("\nAfter removing a book:");
        library.displayBooks();
    }
}
