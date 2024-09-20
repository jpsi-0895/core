# Strings in java

Strings in Java are a fundamental data type used for representing and manipulating text. Java provides a robust String class in the `java.lang` package, which offers a variety of methods to work with strings effectively.

**Key:**

- `Character Array`: `Mutable` (can change the contents), but requires more manual handling.
- `String`: `Immutable` (cannot change once created), but provides many utility methods for manipulation.

```java
public class StringExample {
    public static void main(String[] args) {
        // Declare and initialize a String
        String str = "Hello";

        // Convert String to character array
        char[] charArray = str.toCharArray();

        // Accessing elements of the character array
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
```

Here’s a comprehensive guide to understanding and working with strings in Java:

## 1. String Declaration and Initialization

**Basic Declaration and Initialization**

You can declare and initialize strings in several ways:

```java
String str1 = "Hello, World!";  // String literal
String str2 = new String("Hello, World!");  // String object
```

- `String Literal`: Java optimizes memory usage by creating a single instance of each string literal.
- `String Object`: Creates a new instance of String class, which is generally less efficient due to additional memory allocation.

## 2. Common String Methods

The String class provides numerous methods to perform operations on strings. Here are some of the most commonly used methods:

**Basic Methods**

- `Length`: Get the number of characters in a string.

```java
int length = str1.length(); // 13
```

- `CharAt`: Get the character at a specific index.

```java
char ch = str1.charAt(0); // 'H'
```

- `Substring`: Extract a substring from the string.

```java
String sub = str1.substring(7, 12); // "World"
```

- `IndexOf`: Find the index of the first occurrence of a substring.

```java
int index = str1.indexOf("World"); // 7
```

- `LastIndexOf`: Find the index of the last occurrence of a substring.

```java
int lastIndex = str1.lastIndexOf("o"); // 8
```

- `Replace`: Replace occurrences of a substring with another substring.

```java
String replaced = str1.replace("World", "Java"); // "Hello, Java!"
```

- `ToUpperCase`: Convert all characters in the string to uppercase.

```java
String upper = str1.toUpperCase(); // "HELLO, WORLD!"
```

- `ToLowerCase`: Convert all characters in the string to lowercase.

```java
String lower = str1.toLowerCase(); // "hello, world!"
```

- `Trim`: Remove leading and trailing whitespace.

```java
String trimmed = "   Hello, World!   ".trim(); // "Hello, World!"
```

### String Comparison

- `Equals`: Compare two strings for equality.

```java
boolean isEqual = str1.equals("Hello, World!"); // true
```

- `EqualsIgnoreCase`: Compare two strings for equality, ignoring case.

```java
boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello, world!"); // true
```

- `CompareTo`: Compare two strings lexicographically.

```java
int comparison = str1.compareTo("Hello, World!"); // 0 (equal)
```

## 3. String Immutability

Strings in Java are `immutable`, meaning once a String object is created, its content cannot be changed. Any modification operations (e.g., concatenation) produce a `new String` object.

```java
String original = "Hello";
String modified = original.concat(", World!"); // "Hello, World!"
```

## 4. String Concatenation

You can concatenate strings using the `+ operator` or the concat method:

- Using `+` Operator:

```java
String hello = "Hello";
String world = "World";
String message = hello + ", " + world + "!"; // "Hello, World!"
```

- Using `concat` Method:

```java
String message = hello.concat(", ").concat(world).concat("!"); // "Hello, World!"
```

## 5. String Formatting

You can use `String.format` for formatted strings, similar to `printf` in other languages:

```java
String formatted = String.format("Hello, %s! You are number %d.", "Alice", 1);
// "Hello, Alice! You are number 1."
```

## 6. StringBuilder and StringBuffer

For scenarios where strings need to be modified frequently, `StringBuilder` (non-synchronized) and `StringBuffer` (synchronized) are recommended:

- `StringBuilder`:

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(", World!");
String result = sb.toString(); // "Hello, World!"
```

- `StringBuffer`:

```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(", World!");
String result = sb.toString(); // "Hello, World!"
```

## 7. Regular Expressions

Java provides support for regular expressions through the `Pattern` and `Matcher` classes:

```java
import java.util.regex.*;

Pattern pattern = Pattern.compile("World");
Matcher matcher = pattern.matcher(str1);
boolean found = matcher.find(); // true
```

## 8. String Splitting and Joining

- **`Split`**: Divide a string into an array of substrings based on a delimiter.

```java
String text = "apple,banana,orange";
String[] fruits = text.split(","); // ["apple", "banana", "orange"]
```

- **`Join`**: Combine an array of strings into a single string with a delimiter.

```java
String joined = String.join(", ", fruits); // "apple, banana, orange"
```
