package org.example;

import java.util.Scanner;

public class Library {
    private static final String STUDENT_NIM = "202218073011283"; // contoh NIM
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123"; // contoh password

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Library System");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter 3" +
                            "your NIM: ");
                    String nim = scanner.nextLine();
                    if ( nim.equals(STUDENT_NIM)) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User Not Found or NIM is not 15 characters long");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String password = scanner.nextLine();
                    if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
                        System.out.println("Successful Login as Admin");
                    } else {
                        System.out.println("Admin User Not Found or Incorrect Password");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
                    break;
            }
        }
    }
}