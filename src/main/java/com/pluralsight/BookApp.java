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

//        Book[] listOfBooks = new Book[20];
//
//        listOfBooks[0] = new Book(1, "978-1-11-000002-0", "Potato Knight");
//        listOfBooks[1] = new Book(2, "978-1-11-035865-3", "The Fallen Potato");
//        listOfBooks[2] = new Book(3, "978-1-11-010394-7", "The Adventures of Sweet and Potato");
//        listOfBooks[3] = new Book(4, "978-1-11-038404-5", "Hollow Fry");
//        listOfBooks[4] = new Book(5, "978-1-11-003554-9", "Elden Potato");
//        listOfBooks[5] = new Book(6, "978-1-11-476483-3", "Beginner's Guide For Java");
//        listOfBooks[6] = new Book(7, "978-1-11-134955-3", "The Potato Kid");
//        listOfBooks[7] = new Book(8, "978-1-11-937543-0", "Night of the Living Potatoes");
//        listOfBooks[8] = new Book(9, "978-1-11-038571-2", "Captain Potato");
//        listOfBooks[9] = new Book(10, "978-1-11-058601-1", "The Lost Potato");
//        listOfBooks[10] = new Book(11, "978-1-11-035001-5", "Escape from Potato Mountain");
//        listOfBooks[11] = new Book(12, "978-1-11-123001-8", "The King of Games");
//        listOfBooks[12] = new Book(13, "978-1-11-023401-9", "Titan's Rise");
//        listOfBooks[13] = new Book(14, "978-1-11-000801-6", "Mones");
//        listOfBooks[14] = new Book(15, "978-1-11-008801-5", "Harry Potter");
//        listOfBooks[15] = new Book(16, "978-1-11-077001-4", "Bones");
//        listOfBooks[16] = new Book(17, "978-1-11-044001-4", "Captain Underpants");
//        listOfBooks[17] = new Book(18, "978-1-11-006001-3", "Goosebumps");
//        listOfBooks[18] = new Book(19, "978-1-11-023001-1", "The Lost Ark");
//        listOfBooks[19] = new Book(20, "978-1-11-001001-7", "Dragon's Curse");

        //listOfBooks[12].display();
        //displayList(listOfBooks);
        while (true){

        }

        }

    public static void displayList(Book[] books){
        for (Book book : books) {
            System.out.println(book.getId() + "|" + book.getIsBn() + "|" + book.getTitle());
        }
    }
}
