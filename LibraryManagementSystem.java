import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {

    // Class to represent a Book
    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author;
        }
    }

    // Main class to manage the library
    public static class Library {
        private ArrayList<Book> books;

        public Library() {
            this.books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
            System.out.println("Book added successfully: " + book);
        }

        public void removeBook(String title) {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                    System.out.println("Book removed successfully: " + books.get(i));
                    books.remove(i);
                    return;
                }
            }
            System.out.println("Book with title '" + title + "' not found.");
        }

        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("No books available in the library.");
            } else {
                System.out.println("Books available in the library:");
                for (Book book : books) {
                    System.out.println(book);
                }
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    break;

                case 2:
                    System.out.print("Enter the title of the book to remove: ");
                    String bookTitleToRemove = scanner.nextLine();
                    library.removeBook(bookTitleToRemove);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}