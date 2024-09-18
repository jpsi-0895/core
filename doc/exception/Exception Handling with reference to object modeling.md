# Exception Handling with reference to object modeling in java

`Exception handling` in the context of object modeling is a crucial aspect of robust software design. 

It involves anticipating, detecting, and responding to runtime errors in a way that maintains the integrity of the application and provides meaningful feedback to the user or calling code. 


## 1. Understanding Exceptions
Exceptions are events that disrupt the normal flow of program execution. They can arise from various issues, such as invalid user input, network failures, or resource unavailability. In object-oriented design, exceptions can be modeled as objects themselves, encapsulating information about the error.

## 2. Exception Handling Mechanism
The typical exception handling mechanism involves:

Throwing Exceptions: When an error condition arises, an exception is "thrown." This typically involves creating an instance of an exception class and passing relevant information (like error messages or error codes).

Catching Exceptions: The thrown exception can be caught using try-catch blocks, allowing the program to handle the error gracefully instead of crashing.

Finally Block: A finally block can be used to execute code that must run regardless of whether an exception occurred, such as releasing resources.

