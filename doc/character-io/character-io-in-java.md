# Character i/o in java

Character I/O in Java refers to reading and writing data as `characters` rather than bytes.

This approach is especially useful when dealing with text data because it automatically handles `character encoding`, making it more convenient for reading and writing `human-readable` text.

Java provides several classes for character-based I/O operations, primarily in the `java.io` package.

## Reading Characters from a File

### 1. Using `FileReader` and `BufferedReader`:

- `FileReader` reads characters from a file.

- `BufferedReader` reads text efficiently by buffering input.

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "example.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

**Explanation:**

- `FileReader` reads characters from the file.
- `BufferedReader` wraps `FileReader` to provide efficient reading and to read lines of text.
