package com.kenzie.examples.week10;


import java.io.*;

public class FileCopyDemo {

    public static void main(String[] args) {
        String sourceFile = "src/main/java/com/kenzie/examples/week10/input.txt";
        String destinationFile = "src/main/java/com/kenzie/examples/week10/output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile,true))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.append(line);
                writer.newLine();
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}