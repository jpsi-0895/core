# Formatting output with stream functions in Java

Formatting output is commonly done using the `String.format()` method and `System.out.printf()` method. These methods allow you to control the presentation of your output with various format specifiers and formatting options.

## 1. Using String.format():

The `String.format()` method returns a formatted string using specified format specifiers. This method is useful when you want to format a string before printing it.

```java
String formattedString = String.format(formatString, arguments);
```

### - Formatting Numbers:

```java
double pi = 3.141592653589793;
String formatted = String.format("%.2f", pi);
System.out.println(formatted);
// Output: 3.14
```

### - Padding and Alignment:

```java
String leftAligned = String.format("|%-10s|", "Left");
String rightAligned = String.format("|%10s|", "Right");
System.out.println(leftAligned);
System.out.println(rightAligned);
// Output:
// |Left      |
// |     Right|
```

### - Hexadecimal and Octal:

```java
int num = 255;
String hex = String.format("Hex: %x", num);
String octal = String.format("Octal: %o", num);
String decimal = String.format("Decimal: %d", num);
System.out.println(hex); // Output: Hex: ff
System.out.println(octal); // Output: Octal: 377
System.out.println(decimal); // Output: Decimal: 255
```

## 2. Using System.out.printf()

The `System.out.printf()` method prints a formatted string to the console. It works similarly to `String.format()`, but directly outputs the formatted string.

**Basic Syntax**

```java
System.out.printf(formatString, arguments);
```

### - Formatting Numbers:

```java
double pi = 3.141592653589793;
System.out.printf("%.2f%n", pi);
// Output: 3.14

```

### - Field Width and Alignment:

```java
System.out.printf("|%-10s|%n", "Left");
System.out.printf("|%10s|%n", "Right");
// Output:
// |Left      |
// |     Right|

```

### - Hexadecimal and Octal:

```java
int num = 255;
System.out.printf("Hex: %x%n", num); // Output: Hex: ff
System.out.printf("Octal: %o%n", num); // Output: Octal: 377
System.out.printf("Decimal: %d%n", num); // Output: Decimal: 255

```

### - Padding with Zeros:

```java
System.out.printf("%010d%n", 42);
// Output: 0000000042
```

### - Combining Formatting Options:


```java
System.out.printf("%-10s%05d%n", "Code", 42);
// Output: Code     00042 (left-aligned with zero-padded integer)
```
