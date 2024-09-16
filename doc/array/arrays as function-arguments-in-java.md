# Arrays as function arguments in java

In Java, `arrays` can be passed as arguments to functions just like any other data type.

This allows you to work with collections of data within methods.

## 1. Passing Arrays to Methods

You can pass arrays to methods in a straightforward manner. Here’s an example:

```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);

        // Example with a Person array
        Person[] people = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        };
        printPeople(people);
    }

    // Method to print an array of integers
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to print an array of Person objects
    public static void printPeople(Person[] people) {
        for (Person person : people) {
            person.displayInfo();
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```
