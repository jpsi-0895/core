# Throw and Throws in Java

In Java, Exception Handling is one of the effective means to handle runtime errors so that the regular flow of the application can be preserved. Java Exception Handling is a mechanism to handle runtime errors such as `ClassNotFoundException`, `IOException`, `SQLException`, `RemoteException`, etc.

# Java throw

The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. We can throw either `checked` or `unchecked` exception. The `throw` keyword is mainly used to throw custom exceptions.

**Syntax in Java throw**

```
throw Instance

Example:
throw new ArithmeticException("/ by zero");
```

## Java throw Examples

```java
// Java program that demonstrates the use of throw
class ThrowExcep {
	static void fun()
	{
		try {
			throw new NullPointerException("demo");
		}
		catch (NullPointerException e) {
			System.out.println("Caught inside fun().");
			throw e; // rethrowing the exception
		}
	}

	public static void main(String args[])
	{
		try {
			fun();
		}
		catch (NullPointerException e) {
			System.out.println("Caught in main.");
		}
	}
}
```

**Output**

```
Caught inside fun().
Caught in main.
```

## Java throws

`throws` is a keyword in Java that is used in the signature of a method to indicate that this method might throw one of the listed type exceptions. The caller to these methods has to handle the exception using a `try-catch` block.

**Syntax of Java throws**

```
type method_name(parameters) throws exception_list

exception_list is a comma separated list of all the
exceptions which a method might throw.
```
