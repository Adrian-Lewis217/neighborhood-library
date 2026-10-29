package com.pluralsight;

import java.util.Scanner;

    public class BookApp {
        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);

            // List of Available Books
            Book[] listOfBooks = {
                    new Book(1, "978-1-11-000002-0", "Potato Knight", false),
                    new Book(2, "978-1-11-035865-3", "The Fallen Potato", false),
                    new Book(3, "978-1-11-010394-7", "The Adventures of Sweet and Potato", false),
                    new Book(4, "978-1-11-038404-5", "Hollow Fry", false),
                    new Book(5, "978-1-11-003554-9", "Elden Potato", false),
                    new Book(6, "978-1-11-476483-3", "Beginner's Guide For Java", false),
                    new Book(7, "978-1-11-134955-3", "The Potato Kid", false),
                    new Book(8, "978-1-11-937543-0", "Night of the Living Potatoes", false),
                    new Book(9, "978-1-11-038571-2", "Captain Potato", false),
                    new Book(10, "978-1-11-058601-1", "The Lost Potato", false),
                    new Book(11, "978-1-11-035001-5", "Escape from Potato Mountain", false),
                    new Book(12, "978-1-11-123001-8", "The King of Games", false),
                    new Book(13, "978-1-11-023401-9", "Titan's Rise", false),
                    new Book(14, "978-1-11-000801-6", "Mones", false),
                    new Book(15, "978-1-11-008801-5", "Harry Potter", false),
                    new Book(16, "978-1-11-077001-4", "Bones", false),
                    new Book(17, "978-1-11-044001-4", "Captain Underpants", false),
                    new Book(18, "978-1-11-006001-3", "Goosebumps", false),
                    new Book(19, "978-1-11-023001-1", "The Lost Ark", false),
                    new Book(20, "978-1-11-001001-7", "Dragon's Curse", false)
            };

            // Boolean for making sure the loop continue till the user exit.
            boolean running = true;

            // Loop for home screen
            while (running) {
                // The Home Screen options
                System.out.println("1 - Show Available Books");
                System.out.println("2 - Show Checked Out Books");
                System.out.println("3 - Exit");

                // Prompt the user for option
                System.out.print("Choose an option: ");
                String option = userInput.nextLine();

                // Switch Statement for the home screen
                switch (option) {
                    case "1":
                        showAvailableBooks(listOfBooks,userInput);
                        break;
                    case "2":
                        showCheckedOut(listOfBooks,userInput);
                        break;
                    case "3":
                        System.out.println("Thank you for using our app");
                        running = false;
                        break;
                    default:
                        System.out.println("Please choose from the display options");
                }
            }
            userInput.close();
        }

        public static void showAvailableBooks(Book[] books, Scanner userInput) {

            // Display each book that is not checked out
            for (Book book : books) {

                // Only show the books that are available
                if (!book.isCheckedOut()) {
                    System.out.println(book);
                    System.out.println();
                }
            }

            // Prompt the user if they would like to check out a book
            System.out.print("Would you like to check out a book(Y/N): ");
            String choose = userInput.nextLine();
            System.out.println();

            // if statement for check out
            if (choose.equalsIgnoreCase("Y")) {

                // Prompt the User for Id or return back to main
                System.out.print("Enter an Id to check out, or 0 to go back: ");
                int chooseId = userInput.nextInt();
                userInput.nextLine();
                System.out.println();

                // nested if statement for checking out book
                if (chooseId != 0) {

                    // Variable for if book is found
                    boolean found = false;

                    // Prompt for name if they want to check out the book
                    System.out.print("Enter your name: ");
                    String userName = userInput.nextLine();
                    System.out.println();

                    // Check array of books for the requested book
                    for (int i = 0; i < books.length; i++) {
                        if (books[i].getId() == chooseId) {

                            // if the loop founds the book id change to true
                            found = true;

                            // Change the book to checkedOut or tell user that it's not available
                            if (!books[i].isCheckedOut()) {
                                books[i].setCheckedOut(true);
                                books[i].setCheckedOutTo(userName);

                                // print that the user checked out the book
                                System.out.println(books[i].getTitle() +
                                        " checked out to " + userName);
                                System.out.println();
                            } else {
                                // print that another user has checked out the book
                                System.out.println(books[i].getTitle() +
                                        " is already checked out by " +
                                        books[i].getCheckedOutTo());
                                System.out.println();
                            }

                            break;

                        }
                    }
                    // if user inputs an id that don't exist
                    if (!found) {
                        System.out.println("Book ID not found.");
                        System.out.println();
                    }
                }
            }
        }

        public static void showCheckedOut(Book[] books, Scanner userInput) {

            boolean foundCheckedOut = false;

            for (Book book : books) {

                if (book.isCheckedOut()) {

                    foundCheckedOut = true;

                    System.out.println(book.getId() + " | " + book.getTitle() + " | Checked out to: " + book.getCheckedOutTo());
                    System.out.println();
                }
            }

            if (!foundCheckedOut) {
                System.out.println("No books are currently checked out.");
                System.out.println();
            }

            System.out.print("Enter an ID to check in or 0 to return: ");
            int id = userInput.nextInt();
            System.out.println();

            if (id != 0) {

                for (Book book : books) {

                    if (book.getId() == id) {

                        book.setCheckedOut(false);
                        book.setCheckedOutTo("");

                        System.out.println(book.getTitle() + " has been checked in.");
                        System.out.println();

                        break;
                    }
                }
            }
        }
    }