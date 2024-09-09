# Date in Java

In Java, handling dates and times can be done using various classes from the Java Standard Library.

The most commonly used classes are from the java.time package, introduced in Java 8, which offers a modern and comprehensive API for date and time manipulation.

1. `java.time.LocalDate`
2. `java.time.LocalDateTime`
3. `java.time.ZonedDateTime`

## Legacy Date and Time Classes

Before Java 8, date and time were handled using classes from `java.util` and `java.text` packages. These include:

- `java.util.Date`
- `java.util.Calendar`
- `java.text.SimpleDateFormat`

These classes are considered less robust and more error-prone compared to the `java.time` package.

Here’s a basic example using `java.util.Date`:

```java
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        // Get the current date and time
        Date now = new Date();
        System.out.println("Current date and time: " + now);

        // Create a specific date (deprecated way)
        // Year is offset by 1900, month is 0-based
        Date specificDate = new Date(124, 8, 7);
        System.out.println("Specific date: " + specificDate);
    }
}
```