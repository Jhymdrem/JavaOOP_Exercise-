package book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5");

        System.out.print("""
                BOOK
                ===========================
                """);
        
        System.out.println("First book:");
        Book.addBook(book);
        Book.display();

        System.out.println("Add book:");
        Book.addBook(book2);
        Book.display();

        System.out.println("Removed book:");
        Book.removedBook(0);
        Book.display();

    }
}
