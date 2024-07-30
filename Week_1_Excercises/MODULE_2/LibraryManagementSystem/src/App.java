import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Create an array of books
        Book[] books = {
            new Book("1", "The Catcher in the Rye", "J.D. Salinger"),
            new Book("2", "To Kill a Mockingbird", "Harper Lee"),
            new Book("3", "1984", "George Orwell"),
            new Book("4", "The Great Gatsby", "F. Scott Fitzgerald")
        };

        // Linear Search Example
        System.out.println("Linear Search:");
        Book foundBook = LibrarySystem.linearSearchByTitle(books, "1984");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Sort books by title for binary search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        // Binary Search Example
        System.out.println("\nBinary Search:");
        foundBook = LibrarySystem.binarySearchByTitle(books, "1984");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}
