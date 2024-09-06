# Enum in Java

Enums in Java are a special type of `class` used to define a set of named `constants`. 

They were introduced in `Java 5` and are useful for representing a fixed set of related constants in a type-safe manner.

## Key Points
1. `Enum Constants`: Enum constants are implicitly `public`, `static`, and `final`.

2. `Constructors`: Enum constructors are `private`. You can't create new enum instances outside the enum class.

3. `Methods`: You can define methods and fields in enums, just like in regular classes.

4. `Methods`: Enums have built-in methods like `name()`, `ordinal()`, and `values()`.

5. `Use Cases`: Enums are ideal for representing fixed sets of constants and adding behaviors specific to those constants.