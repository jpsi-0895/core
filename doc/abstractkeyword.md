# Abstract methdos and classes

> An abstract class is a class that is declared abstract - - it may or may not include abstract methods

- Abstract classes cannot be instantiated, but they can be subclassed.


> When an abstract class is subclassed, the subclass usually provides implementation for all the abstract methods in its parent class


## Properties

1. abstract method do not have body.A well defined method can't be declared abstract.
2. A class which has abstract method must be declared as abstract.
3. Abstract class can't be instantiated.
4. An Abstract class can have both the Non-abstract as well as Abstract methods.
5. An Abstract method must be implemented by the very first Non-Abstract sub-class.
6. Abstract class in Design patterns are used to encapsulate the behaviors that keeps changing.

An abstract method is a method signature declaration with no body. For instance:
```java
public abstract class Shape {
    . . .

    public abstract double getArea();
    public abstract double getPerimeter();
}
```
The methods getArea() and getPerimeter() are abstract. Because the Shape class has an abstract method, it must be declared abstract as well. A class may also be declared abstract without any abstract methods. When a class is abstract, an instance of it cannot be created; one can only create instances of (concrete) subclasses. A concrete class is a class that is not declared abstract (and therefore has no abstract methods and implements all inherited abstract methods). For instance:

```java
public class Circle extends Shape {
    public double radius;
    . . .

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
}
```
There are many reasons to do this. One would be to write a method that would be the same for all shapes but that depends on shape-specific behavior that is unknown at the Shape level. For instance, one could write the method:

```java
public abstract class Shape {
    . . .

    public void printArea(PrintStream out) {
        out.println("The area is " + getArea());
    }
}
```
Admittedly, this is a contrived example, but it shows the basic idea: define concrete behavior in terms of unspecified behavior.

Another reason for having an abstract class is so you can partially implement an interface. All methods declared in an interface are inherited as abstract methods by any class that implements the interface. Sometimes you want to provide a partial implementation of an interface in a class and leave the details to subclasses; the partial implementation must be declared abstract.