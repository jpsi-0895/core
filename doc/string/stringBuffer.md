# StringBuffer in Java

`StringBuffer` is a mutable sequence of characters.

- Unlike String, which is `immutable`, StringBuffer allows you to modify its contents without creating new objects, making it more efficient for situations where strings are changed frequently.

## Key Features of StringBuffer

- `Mutability`: You can change the content of a StringBuffer after it has been created.
- `Thread-Safety`: StringBuffer methods are synchronized, making it safe for use in a multi-threaded environment.
- `Dynamic Size`: It can grow as needed to accommodate new characters.
