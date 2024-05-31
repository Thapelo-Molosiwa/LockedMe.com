package com.lockedme;



import java.util.Scanner;

public class MainMenu {

    private static Scanner scanner = new Scanner(System.in);

    public static void displayWelcomeScreen() {
        System.out.println("*****************************************");
        System.out.println(" Welcome to LockedMe.com ");
        System.out.println(" Developer: Your Name ");
        System.out.println("*****************************************");
    }

    public static void main(String[] args) {
        displayWelcomeScreen();
        handleUserInput();
    }

    public static void handleUserInput() {
        while (true) {
            displayMainMenu();
            int choice = getInput();
            switch (choice) {
                case 1:
                    FileManager.listFiles();
                    break;
                case 2:
                    handleFileOptions();
                    break;
                case 3:
                    System.out.println("Exiting the application...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. List files in ascending order");
        System.out.println("2. File operations");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getInput() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void handleFileOptions() {
        while (true) {
            displayFileMenu();
            int choice = getInput();
            switch (choice) {
                case 1:
                    System.out.print("Enter the file name to add: ");
                    String addFileName = scanner.nextLine();
                    FileManager.addFile(addFileName);
                    break;
                case 2:
                    System.out.print("Enter the file name to delete: ");
                    String deleteFileName = scanner.nextLine();
                    FileManager.deleteFile(deleteFileName);
                    break;
                case 3:
                    System.out.print("Enter the file name to search: ");
                    String searchFileName = scanner.nextLine();
                    FileManager.searchFile(searchFileName);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayFileMenu() {
        System.out.println("\nFile Operations:");
        System.out.println("1. Add a file");
        System.out.println("2. Delete a file");
        System.out.println("3. Search a file");
        System.out.println("4. Return to main menu");
        System.out.print("Enter your choice: ");
    }
}
