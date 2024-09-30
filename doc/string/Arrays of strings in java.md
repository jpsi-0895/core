# Arrays of strings in java

In Java, you can create and manipulate arrays of strings quite easily. Here’s a guide on how to do this, including declaration, initialization, and accessing elements.

## 1. Declaring and Initializing a String Array

You can declare and initialize a string array in several ways:

**Method 1: Inline Initialization**

```java
public class StringArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of strings
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        // Accessing elements of the array
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

**Method 2: Separate Declaration and Initialization**

```java
public class StringArrayExample {
    public static void main(String[] args) {
        // Declare an array of strings
        String[] animals = new String[4];

        // Initialize the elements
        animals[0] = "Cat";
        animals[1] = "Dog";
        animals[2] = "Elephant";
        animals[3] = "Fox";

        // Accessing elements of the array
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
```
