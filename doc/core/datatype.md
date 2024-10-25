- `Precision`: double is more precise than float. While float can handle approximately `7` decimal digits, double can handle about `15` decimal digits.

- `Float Suffix`: When assigning a decimal literal to a float variable, always append the `f` or `F` suffix.

This indicates that the number is a float, not a double (`the default type for decimal literals`).

```java
float myFloat = 2.5f;  // Correct
// float myFloat = 2.5; // This would cause a compilation error
```

### Default Value:

If you declare a `float` variable without initializing it, its default value will be `0.0f`.

```java
float result = 0.1f + 0.2f;
System.out.println("Result: " + result);  // May output: 0.30000004
```
