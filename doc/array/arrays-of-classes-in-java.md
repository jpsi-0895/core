# Arrays of classes in java

In Java, you can create `arrays of class` objects, just as you would with primitive types or other types of objects.

This allows you to manage collections of class instances efficiently.

## 1. Define a Class

First, define the class you want to store in the array. For example, let's define a simple Person class:

```java
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```
