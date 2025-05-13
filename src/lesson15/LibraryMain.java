package lesson15;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Aaa", "Bbb");
        Book book2 = new Book("Zzz", "Ccc");

        Users user1 = new Users("User 1", 19);
        Users user2 = new Users("User 2", 19);

        library.addBook(book1);
        library.addBook(book2);

        library.availableBook();

        library.takeBook("Aaa", user1);

        library.availableBook();

        user1.listMyBooks();
        user2.listMyBooks();

        library.returnBook("Aaa", user1);

        library.availableBook();

        user1.listMyBooks();
        user2.listMyBooks();
    }
}
