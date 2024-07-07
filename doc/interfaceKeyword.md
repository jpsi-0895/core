# Interface

An interface is a special form of an abstract class which does not implement any methods. In Java, you create an interface like this:

```java

interface Interface
{
    void interfaceMethod();
}

```

Since the interface can't implement any methods, it's implied that the entire thing, including all the methods, are both public and abstract. So the interface above is identical to the interface below:

> abstract in Java terms means "not implemented by this class"

> A class can'nt extends many class

```java

public interface Interface
{
    abstract public void interfaceMethod();
}

```


### Methods:

 - Abstract: All methods in an interface are implicitly abstract. You don't need to use the abstract keyword. They only declare the method signature (name and parameters) but don't provide an implementation. Implementing classes must provide the functionality for these methods.
- Public: By default, all interface methods are public. This ensures they are accessible by any class that implements the interface.

### Fields (Constants):

Static and final: Interfaces can have fields, but they must be declared static and final. This essentially creates constants accessible throughout the program. Their values are fixed at compile time.