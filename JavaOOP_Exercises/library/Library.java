package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library(Book newBook) {
        books.add(newBook);
    }

    public void addBook(Book newBook) {
        books.add(newBook);
        System.out.println("[ " + newBook.getTitle() + ": successfully added! ]");
    }

    public void removedBook(String bookTitle) {
        for (Book book : books) {
            if (bookTitle.equals(book.getTitle())) {
                books.remove(book);
                System.out.println("[ " + bookTitle + ": successfully removed! ]");
                return;
            }
        }
        System.out.println("[ " + bookTitle + ": not found! ]");
    }

    public void getBook(String bookTitle) {
        for (Book book : books) {
            if (bookTitle.equals(book.getTitle())) {
                System.out.println("[ " + bookTitle + ": get all the content of the book! ]");
                return;
            }
        }
        System.out.println("[ " + bookTitle + ": not found! ]");
    }

    public void displayInfo() {
        System.out.println("List of Books: ");

        for (Book book : books) {
            System.out.println('\t' + book.getTitle());
        }
    }
}
