# Writing Final classes and Methods

you can declare some or all of a class's methods final. 

Final keywords before methods:
1.  cannot overriden by subclasses.
2.  by final keyword you can manage a variable or object consistent state
3. you can also declare an entire class final. A class that is declared final cannot be suhbclassed.This is particulary usefull, for example, when creating an immutable class like the String class

> You are always allowed to initialize a final variable. The compiler makes sure that you can do it only once.
> When an anonymous inner class is defined within the body of a method, all variables declared final in the scope of that method are accessible from within the inner class

The final keyword can be interpreted in two different ways depending on what it's used on:

**Value types**: For ints, doubles etc, it will ensure that the value cannot change,

**Reference types**: For references to objects, final ensures that the reference will never change, meaning that it will always refer to the same object. It makes no guarantees whatsoever about the values inside the object being referred to staying the same.

As such, final List<Whatever> foo; ensures that foo always refers to the same list, but the contents of said list may change over time.


Java final class:

If you make any class as final, you cannot extend it.

Example of final class

```java 
final class Bike{}  

class Honda1 extends Bike{    //cannot inherit from final Bike,this will make error
  void run(){
      System.out.println("running safely with 100kmph");
   }  

  public static void main(String args[]){  
      Honda1 honda= new Honda();  
      honda.run();  
      }  
  }  

```