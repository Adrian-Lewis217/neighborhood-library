package com.pluralsight;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // The Home Screen
        System.out.println("1 - Show Available Books");
        System.out.println("2 - Show Checked Out Books");
        System.out.println("3 - Exit");
        System.out.print("Choose an option: ");

        // Prompt the user for option
        String option = userInput.nextLine();
        userInput.nextLine();
        System.out.println(option);
        
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

        // Switch Statement
        switch (option){
            case "1":
                showAvailableBooks(listOfBooks);
                break;
            case "2":
                showCheckedOut();
                break;
            case "3":
                System.out.println("Thank you for using our app");
                break;
            default:
                System.out.println("Please choose from the display options");
        }
        }

    public static void displayList(Book[] books){
        for (Book book : books) {
            System.out.println(book.getId() + "|" + book.getIsBn() + "|" + book.getTitle());
        }
    }

    public static void showAvailableBooks(Book[] books){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books);
        }
    }
    public static void showCheckedOut(){}
}
