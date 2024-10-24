### Which of the following modifiers can be applied to an abstract method?

**In Java, an abstract method can have the following modifiers:**

- `public`: The method can be accessed by any class.
- `protected`: The method can be accessed by classes in the same package or subclasses.
- `default` (no modifier): The method can be accessed by classes in the same package.
- `private`: This is not allowed for abstract methods because abstract methods need to be accessible to subclasses for implementation.

So, the valid modifiers for an abstract method are `public`, `protected`, and `default` (package-private).

### Which of the following modifiers cannot be aplied to an interface method?

In Java, the following modifiers cannot be applied to an interface method:

1. `private`: Prior to Java 9, interface methods were implicitly public and could not be private. However, since Java 9, you can have private methods in interfaces, but they cannot be abstract.
2. `static`: Interface methods cannot be static if they are abstract. However, starting with Java 8, interfaces can contain static methods, but they must provide an implementation.
3. `final`: You cannot declare interface methods as final, as they are meant to be overridden by implementing classes.

So, the main modifiers that cannot apply to an `abstract interface` method are `private` (for abstract methods), `static` (for abstract methods), and `final`.

### Is an object type or reference determines which attributes exist in memory

An `object` type determines which attributes exist in memory. When an object is created from a class, it allocates memory for the attributes defined in that class.

The `reference` type can influence what methods and attributes you can access through that reference, especially in cases of polymorphism, but the actual attributes that exist in memory are dictated by the object's class type.

So, `to summarize`: the `object type` defines the attributes in memory, while the `reference type` affects how you can interact with the object.
