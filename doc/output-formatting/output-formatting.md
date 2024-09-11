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
