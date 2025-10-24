package library;

public class LibraryMain {
    public static void main(String[] args) {
        Book book = new Book("Dragon Slayer");
        Book book1 = new Book("Demon Heart");
        Book book2 = new Book("Mr.Unknown");

        System.out.println("""
                LIBRARY THE LIST OF BOOKS
                ======================================
                """);
        Library library = new Library(book);
        library.displayInfo();
        System.out.println();

        library.addBook(book2);
        library.displayInfo();
        System.out.println();

        library.addBook(book1);
        library.displayInfo();
        System.out.println();

        library.removedBook("Dragon Slayer");
        library.displayInfo();
        System.out.println();

        library.getBook("Dragon Slayer");
        library.displayInfo();
        System.out.println();

        library.getBook("Mr.Unknown");
        library.displayInfo();
        System.out.println();
    }
}
