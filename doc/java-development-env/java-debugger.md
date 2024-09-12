# Java Debugger

`JDB` (Java Debugger) is a command-line tool used for debugging Java programs.
It is part of the `JDK` (Java Development Kit) and provides a way to inspect and control the `execution` of Java programs.

Here’s a basic overview of how to use JDB:

## Starting JDB

1. `Compile Your Java Program with Debug Information:`
   Make sure you compile your Java program with the -g option to include debug information.

```sh
javac -g MyProgram.java
```

2. `Start JDB`: You can start JDB with your program using the following command:

```sh
jdb MyProgram
```
