# Nested classes

The java programming language allows you to define a class within another class. Such a class is called a nested class:

```java
class Outer class {
    ...
    class InnerClass{
        ...
    }
}

object:

OuterClass outerClass = new OuterClass()
OuterClass.InnerClass innerObject = outerObject.new InnerClass();

```

> Category of inner class

1. non-static inner class
2. static nested class

```java
class OuterClass{
    class InnerClass{

    }
    static class StaticNestedClass{

    }
}
```

Static nested classes are accessed using the enclosing class name:

> OuterClass.StaticNestedClass

## Properties

-

> _Package private_ is the default access-control modifier in Java. If a member of a class is not annotated with `private`, `protected`, or `public`, then the member is `package private` by default. When a member is `package-private`, it can only be accessed by the parent class, and other classes in the same package.


### There are four kinds of nested class in Java. In brief, they are:

1. static class: declared as a static member of another class
2. inner class: declared as an instance member of another class
3. local inner class: declared inside an instance method of another class
4. anonymous inner class: like a local inner class, but written as an expression which returns a one-off object.

Let me elaborate in more details.

## Static Classes

Static classes are the easiest kind to understand beccuase they have nothing to do with instances of the containg class.

```java

package pizza;

public class Rhino {

    ...

    public static class Goat{
        ...
    }
}

access by using > pizza.Rhino.Goat

```

## Inner Class

An inner class is a class declared as a non-static member of another class:

```java
package pizza;

public class Rhino {

    public class Goat {
        ...
    }

    private void jerry() {
        Goat g = new Goat();
    }
}
object:

Rhino rhino = new Rhino();
Rhino.Goat goat = rhino.new Goat();

```

Like with a static class, the inner class is known as qualified by its containing class name, pizza.Rhino.Goat, but inside the containing class, it can be known by its simple name. However, every instance of an inner class is tied to a particular instance of its containing class: above, the Goat created in jerry, is implicitly tied to the Rhino instance this in jerry. Otherwise, we make the associated Rhino instance explicit when we instantiate Goat:

> Well, the inner class instance has access to the instance members of the containing class instance.