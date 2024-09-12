# Data type

| Data Types            | Default value |
| --------------------- | ------------- |
| byte                  | 0             |
| shot                  | 0             |
| int                   | 0             |
| long                  | 0l            |
| float                 | 0.0f          |
| double                | 0.0d          |
| char                  | "\u0000"      |
| string(or any object) | null          |
| boolean               | false         |

## Note

Local variable are slightly different; the compiler never assigns a defualt value to an uninitialized local variable. If you cannot initialize your local variable where it is declared, **make sure to assign it a value before you attempt to use it**.

> Accessing an uninitialized local variable will result in a compile-time error.

## Using Underscore Characters in Numeric Literals

### You can place underscore only between digits; you cannot place underscores in the following places:

- At the beginning or end of a number
- Adjacent to a decimal point in a floating literal
- Prior to an F or L suffix
- In positions where a string of digits is expected

#### Invalid: cannot put underscores

float pil = 3\_.1415F; // adjacent to a decimal point
float pi2 = 3.\_1415F; // adjacent to a decimal point
long socialSecurityNumber1 = 9999_99_9999_L // cannot put underscores prior to a decimal point

int x2 = 52\_;
int x3 = 5**\_**2; // ok

int x4 = 0*x52; // cannot put underscores in the 0x radix prefix
int x5 = 0x_52;
int x7 = 0x52*;

## What is the difference between int and Integer?

- `int`: This is a primitive data type. It stores the actual value and is more efficient in terms of performance.

- `Integer`: This is a wrapper class for the int type, part of the `java.lang` package. It is an object that contains a field for the `int` value and provides utility methods for converting between int and other types. `Integer` is useful when working with collections that require objects, like `ArrayList`.

## What are wrapper classes and why are they used?

`Wrapper classes are used to convert primitive types into objects`. Java provides wrapper classes for each primitive type:

- Byte
- Short
- Integer
- Long
- Float
- Double
- Character
- Boolean

They are used to work with objects in situations where primitives are not allowed, such as in collections like `ArrayList` or `HashMap`. They also provide utility methods for converting between different types.

## What is autoboxing and unboxing?

- `Autoboxing`: The automatic conversion that the Java compiler makes between primitive types and their corresponding wrapper classes. For example, converting int to Integer automatically when you add an int to a collection that requires Integer.

- `Unboxing`: The reverse process of autoboxing, where an `Integer` object is automatically converted to an `int`.

```java
List<Integer> list = new ArrayList<>();
list.add(10);  // autoboxing
int value = list.get(0);  // unboxing
```

## How does Java handle numeric overflow and underflow?

Java does not automatically check for `overflow` and `underflow` with primitive types. For example, adding two large int values might result in overflow, wrapping around to negative values. If you need to handle such cases, you should use classes from the `java.math` package, like `BigInteger` for arbitrary-precision integers.

```java
int maxInt = Integer.MAX_VALUE;
int result = maxInt + 1;  // Overflow occurs
```