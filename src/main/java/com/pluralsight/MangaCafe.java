package com.pluralsight;

import java.util.Scanner;

public class MangaCafe {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Book[] inventory = {
                new Book(1, "978-1-56931-899-8", "Naruto", "", true),
                new Book(2, "978-1-59116-137-2", "One Piece", "", false),
                new Book(3, "978-1-61262-024-4", "Attack on Titan", "", false),
                new Book(4, "978-1-4215-0168-5", "Death Note", "", false),
                new Book(5, "978-1-4215-7425-7", "My Hero Academia", "", true),
                new Book(6, "978-1-9747-0143-5", "Demon Slayer", "", false),
                new Book(7, "978-1-4215-7084-6", "Tokyo Ghoul", "", false),
                new Book(8, "978-1-59116-920-0", "Fullmetal Alchemist", "", false),
                new Book(9, "978-1-59116-441-0", "Bleach", "", false),
                new Book(10, "978-1-56931-925-4", "Dragon Ball", "", false),
                new Book(11, "978-1-9747-1654-5", "Chainsaw Man", "", true),
                new Book(12, "978-1-9747-1244-8", "Jujutsu Kaisen", "", true),
                new Book(13, "978-1-9747-2090-0", "Spy x Family", "", false),
                new Book(14, "978-1-59307-020-5", "Berserk", "", false),
                new Book(15, "978-1-59116-785-5", "Hunter x Hunter", "", false),
                new Book(16, "978-1-61262-142-5", "Vinland Saga", "", true),
                new Book(17, "978-1-4215-7881-1", "One Punch Man", "", false),
                new Book(18, "978-1-5067-0812-4", "Mob Psycho 100", "", true),
                new Book(19, "978-1-4215-7883-5", "Haikyu!!", "", false),
                new Book(20, "978-1-9747-0728-4", "The Promised Neverland", "", false)
        };
        System.out.println("Welcome To The MangaCafe \n");

        while (true) {

            System.out.println("Please Choose From Among These");
            System.out.println("    1. Show Available Book");
            System.out.println("    2. Show Checked Out Books");
            System.out.println( "   3. Check Out A book");
            System.out.println("    10. Exit \n");
            System.out.println("Make Your Selection: ");
            int userChoice = scan.nextInt();
            scan.nextLine();

            switch (userChoice) {
                case 1:
                    showAvailableBooks(inventory);
                    break;

                case 2:
                    showCheckedOut(inventory);
                    break;

                case 3:
                    scan.nextLine();
                    System.exit(0);

                case 4:
                    checkOutbook(inventory, scan);
                    break;
                default:
                    System.out.println("Too Bad, try again");
            }
        }
    }

    public static void showAvailableBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book.getTitle());

        }
    }

    public static void showCheckedOut(Book[] books) {
        for (Book book : books) {
            if (book.isCheckedOut()) {
                System.out.println(book.getTitle());
            }
        }
    }
    public static void CheckOutbook(Book[] Book,Scanner scan ) {
        System.out.println("PLease Enter ID Here");
        int Bookid = scan.nextInt();


    }
}