package com.kenzie.examples.week10;

import java.io.*;

public class FileReadWriteDemo {

    public static void main(String[] args) throws IOException {
        String inputFile = "input.txt";
        String outputFile = "output2.txt";

        // Read from the file
        try{
            FileReader fReader = new FileReader(inputFile);
            BufferedReader reader = new BufferedReader(fReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        finally{
        }

        // Write to the file
        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a sample text.");
            System.out.println("Write to file: Successful");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        finally{
            writer.close();
        }
    }
}

