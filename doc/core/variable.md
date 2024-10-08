# Static block

A static block is a section of code that runs when the class is loaded, before any instances of the class are created or any static methods are called.

## 1. Initialization of Static Variables

Static blocks are commonly used to initialize `static` variables. This can be useful for complex initialization that cannot be done in a single line.

```java
class Example {
    static int value;

    static {
        value = 10; // Initialization
    }
}
```

## 2. Execution Order

Static blocks are executed in the order they appear in the class. If there are `multiple` static blocks, they will run sequentially.

```java
class Example {
    static {
        System.out.println("First static block");
    }

    static {
        System.out.println("Second static block");
    }
}
```

## 3. Only Executed Once

Static blocks are executed only once when the class is loaded into `memory`. They are not executed every time an instance of the class is created.

## 4. Access to Static Members

Static blocks can access static variables and methods of the class directly.
