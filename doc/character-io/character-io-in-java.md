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

### 2. Using FileReader Directly:

If you don’t need buffering or line-by-line reading, you can use FileReader directly.

```java
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDirectExample {
    public static void main(String[] args) {
        String filePath = "example.txt";
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Explanation:**

- `FileReader` reads one character at a time.
- The `read()` method returns the next character as an `integer`.

## Writing Characters to a File

### 1. Using FileWriter and BufferedWriter:

- `FileWriter` writes characters to a file.
- `BufferedWriter` wraps `FileWriter` to provide buffering and efficient writing.

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String filePath = "output.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a test.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Explanation:**

- `FileWriter` writes characters to the file.
- `BufferedWriter` wraps `FileWriter` for efficient writing and provides methods like `newLine()` for line breaks.

### 2. Using FileWriter Directly:

If you don’t need buffering, you can use FileWriter directly.

```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDirectExample {
    public static void main(String[] args) {
        String filePath = "output.txt";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, World!");
            writer.write("\nThis is a test.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
**Explanation:**

- `FileWriter` writes characters directly to the file.
- You can use `write()` to write individual characters or strings.

## Reading and Writing Characters Using PrintWriter

`PrintWriter` is a convenience class that wraps around other writer classes to provide methods for writing formatted text. It can be used with `FileWriter` and `BufferedWriter`.

- `PrintWriter` is typically used for writing rather than reading, so it’s not commonly used for reading characters.