# Enum in Java

Enums in Java are a special type of `class` used to define a set of named `constants`.

They were introduced in `Java 5` and are useful for representing a fixed set of related constants in a type-safe manner.

## Basic Enum Definition

An enum in Java is defined using the enum keyword.

```java
public enum Direction {
    NORTH, EAST, SOUTH, WEST
}
```

> In this above example, Direction is an enum with four constants: NORTH, EAST, SOUTH, and WEST.

## Key Points

1. `Enum Constants`: Enum constants are implicitly `public`, `static`, and `final`.

2. `Constructors`: Enum constructors are `private`. You can't create new enum instances outside the enum class.

3. `Methods`: You can define methods and fields in enums, just like in regular classes.

4. `Methods`: Enums have built-in methods like `name()`, `ordinal()`, and `values()`.

5. `Use Cases`: Enums are ideal for representing fixed sets of constants and adding behaviors specific to those constants.

### Example with Custom Fields and Methods

```java
public enum Season {
    WINTER("Cold and snowy"),
    SPRING("Warm and blossoming"),
    SUMMER("Hot and sunny"),
    FALL("Cool and windy");

    private final String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isWarm() {
        return this == SPRING || this == SUMMER;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.printf("%s: %s (Warm: %s)%n",
                              season.name(), season.getDescription(), season.isWarm());
        }
    }
}

```

**Output**:

```
WINTER: Cold and snowy (Warm: false)
SPRING: Warm and blossoming (Warm: true)
SUMMER: Hot and sunny (Warm: true)
FALL: Cool and windy (Warm: false)
```
