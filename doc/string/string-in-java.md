# Strings in java

Strings in Java are a fundamental data type used for representing and manipulating text. Java provides a robust String class in the `java.lang` package, which offers a variety of methods to work with strings effectively.

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

```java

```

```java

```
