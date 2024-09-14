import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of User, Librarian, and Book
        User user1 = new User("Carlos", "Gomez", "U001");
        User user2 = new User("Laura", "Martinez", "U002");
        Librarian librarian = new Librarian("Ana", "Lopez", "L001");
        Book book1 = new Book("Java for Everyone", "John Doe", "1234567890");
        Book book2 = new Book("Learning Python", "Jane Smith", "0987654321");

        // Show details of users and librarians
        System.out.println("User Details:");
        user1.showDetails();
        user2.showDetails();

        System.out.println("\nLibrarian Details:");
        librarian.showDetails();

        // Simulate book loans and returns
        librarian.loanBook(book1, user1);
        librarian.loanBook(book2, user2);

        // Show the status of the books
        System.out.println("\nBook Status:");
        System.out.println(book1);
        System.out.println(book2);

        // Return books
        librarian.returnBook(book1, user1);
        librarian.returnBook(book2, user2);

        // Show the status of the books after return
        System.out.println("\nBook Status After Return:");
        System.out.println(book1);
        System.out.println(book2);

        // Count the total number of loaned books using Functional Programming
        List<Book> books = Arrays.asList(book1, book2);
        long totalLoaned = books.stream().filter(book -> !book.isAvailable()).count();
        System.out.println("\nTotal Number of Loaned Books: " + totalLoaned);
    }
}