package book;

import java.util.ArrayList;

public class Book {

    private static ArrayList<Book> books = new ArrayList<>();
    private String title;
    private String author;
    private String ISBN;

    public Book() {

    }

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void seAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void addBook(Book book) {
        books.add(book);
        System.out.println("[ Book added: " + book.getTitle() + " by " + book.getAuthor() + ". ]");
    }

    public static void removedBook(int index) {
        if (index >= 0 && index < books.size()) {
            System.out.println("Removed: " + books.get(index).getTitle());
            books.remove(index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public static void display() {
        System.out.print("""
                \nCurrent Book Collection:
                =================================
                """);
        if (books.isEmpty()) {
            System.out.println("No books in the collection yet!");
        } else {
            for (int i = 0; i < books.size(); i++) {
                Book b = books.get(i);
                System.out.println((i + 1) + ". " + b.getTitle() + "\n   Autot: " + b.getAuthor() + "\n   ISBN: " + b.getISBN() + "\n");
            }
        }
    }
    
}
