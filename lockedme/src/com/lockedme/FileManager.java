package com.lockedme;



import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileManager {

    private static final String DIRECTORY = "files";

    public static void listFiles() {
        File folder = new File(DIRECTORY);
        if (!folder.exists()) {
            folder.mkdir();
        }
        String[] files = folder.list();
        if (files != null && files.length > 0) {
            Arrays.sort(files);
            System.out.println("Files in directory:");
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Directory is empty.");
        }
    }

    public static void addFile(String fileName) {
        File file = new File(DIRECTORY + "/" + fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File added: " + fileName);
            } else {
                System.out.println("File already exists: " + fileName);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while adding the file.");
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(DIRECTORY + "/" + fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted: " + fileName);
            } else {
                System.out.println("Failed to delete file: " + fileName);
            }
        } else {
            System.out.println("File not found: " + fileName);
        }
    }

    public static void searchFile(String fileName) {
        File folder = new File(DIRECTORY);
        String[] files = folder.list();
        if (files != null && files.length > 0) {
            boolean found = Arrays.stream(files).anyMatch(file -> file.equals(fileName));
            if (found) {
                System.out.println("File found: " + fileName);
            } else {
                System.out.println("File not found: " + fileName);
            }
        } else {
            System.out.println("Directory is empty.");
        }
    }
}
