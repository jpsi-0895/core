# Autoboxing and Unboxing

```java

class Main {
	public static void main(String[] args)
	{
		Double x1, y1, z1;
		double x2, y2, z2;
		x1 = 10.0;
		y1 = 4.0;
		z1 = x1 * x1 + y1 * y1;
		x2 = 10.0;
		y2 = 4.0;
		z2 = x2 * x2 + y2 * y2;
		System.out.print(z1 + " ");
		System.out.println(z2);
	}
}

/*

Options:
A. 116.0 116.0
B. Run-time error
C. Compile-time error
D. 116 116.0

Answer: A. 116.0 116.0

Explanation: First, the values 10.0 and 20.0 are auto-boxed in x1 and y1 respectively. Then for calculating z1, x1 and y1 are unboxed and the expression is evaluated, then the result is boxed into z1. While, printing z1, it is auto-unboxed, the value is printed then reboxed. z2 is calculated normally using primitive data-types.

*/

class Main {
	public static void main(String[] args)
	{
		Boolean b1 = true;
		Boolean b2 = false;
		System.out.print((b1 == b2) + " ");
		System.out.print(b1.equals(b2));
	}
}

/*
Options:
A. Compile-time error
B. false false
C. false true
D. true true

Answer: B. false false

Explanation: The values true and false are auto-boxed in b1 and b2 respectively. For b1==b2, b1 and b2 are unboxed and then compared which return false. For b1.equals(b2), as b1 and b2 are Boolean objects, they can be compared using equals() method. This also returns false as b1 and b2 are not equal.
*/

class Main { 
	public static void main(String args[]) 
	{ 
		Double x = new Double(10); 
		double i = x.doubleValue(); 
		System.out.print(i + " " + x); 
	} 
} 

/*
Options:
A. Compile-time error
B. 10 10
C. 10.0 10.0
D. 10 10.0

Answer: C. 10.0 10.0

Explanation: x is a Double type object. Therefore when x is printed it will be auto-unboxed and 10.0 will be printed. Whereas, doubleValue() is a method for unboxing a Double object into double. Therefore, i will also have a value of 10.0.
*/

class Main { 
	static int funct(Integer x) 
	{ 
		return x; 
	} 
	public static void main(String args[]) 
	{ 
		Integer x = funct(10); 
		System.out.println(x); 
	} 
} 

/*
Options:
A. Compile-time error
B. Run-time error
C. 10
D. No output

Answer: C. 10

Explanation: When 10 is passes into funct(), it is autoboxed. When the value is returned from funct it is autoboxed and then the value is again auto-boxed in x. When x is printed, it is again unboxed.
*/

class Main { 
	public static void main(String args[]) 
	{ 
		Boolean b1 = "TRUE"; 
		Boolean b2 = "FALSE"; 
		boolean b = b1 && b2; 
		System.out.println(b); 
	} 
} 

/*
Options:
A. Compile-time error
B. FALSE
C. false
D. TRUE

Answer: A. Compile-time error

Explanation: It will be a compile-time error because “TRUE” and “FALSE” are Strings and cannot be converted to Boolean.
*/
```
