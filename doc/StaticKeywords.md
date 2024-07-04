# Static Keywords 

The static keyword is one of the most essential features in the Java programming language. We use it to define class-level variables and methods.
> The static keyword in Java is used for memory management mainly. 

> Static variables and static methods are two important concepts in Java.

Whenever a variable is declared as static, this means there is only one copy of it for the entire class, rather than each instance having its own copy. A static method means it can be called without creating an instance of the class.

Static variables and methods in Java provide several advantages, including memory efficiency, global access, object independence, performance, and code organization.

The static can be:
1. Variable (also known as a class variable)
2. Method (also known as a class method)
3. Block
4. Nested class

> Q) Why is the Java main method static?
> Ans) It is because the object is not required to call a static method. If it were
a non-static method, JVM creates an object frst then call main() method that
will lead the problem of extra memory allocation.

> **Java static block** - It is executed before the main method at the time of classloading.