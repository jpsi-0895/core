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
