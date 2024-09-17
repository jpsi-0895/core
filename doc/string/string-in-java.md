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
