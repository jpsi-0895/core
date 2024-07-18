
package java.Exception;

import java.io.IOException;

/**
 * ThrwExample
 */
public class ThrwExample {

    public void readFile() throws IOException {
        throw new IOException("File not found!!!");
    }

    public static void main(String[] args) {
        ThrwExample example = new ThrwExample();
        try {
            example.readFile();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}