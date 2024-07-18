package java.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleExceptions {

    // Method declaration with throws IOException and FileNotFoundException
    public void openFile(String filename) throws IOException, FileNotFoundException {
        if (filename == null || filename.isEmpty()) {
            throw new FileNotFoundException("File name is null or empty");
        }
        
        // Simulating an IOException
        throw new IOException("Error opening file");
    }

    // Main method to demonstrate the usage
    public static void main(String[] args) {
        MultipleExceptions example = new MultipleExceptions();
        
        try {
            // Calling a method that throws IOException and FileNotFoundException
            example.openFile(null);
        } catch (FileNotFoundException e) {
            // Handling FileNotFoundException
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Handling IOException
            System.err.println("Error opening file: " + e.getMessage());
        }
    }
}


/*
 * 
 * Explanation:
 * 
Method openFile(): This method is declared with throws IOException, FileNotFoundException, indicating that it may throw either of these exceptions during its execution.

main Method:

Inside the main method, an instance of ExampleMultipleThrows is created.
The openFile() method is called with null as the filename, which causes a FileNotFoundException to be thrown first.
The exceptions are caught separately in catch blocks based on their types, and appropriate error messages are printed.

Key Points:

throws Keyword: Used in the method signature to declare that a method may throw one or more exceptions.
try-catch Blocks: Used to handle exceptions that are thrown by methods declared with throws.
Exception Handling: Essential for managing errors and ensuring robustness in Java applications.
 */