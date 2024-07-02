# Super Keywords

### Accessing Supercass Members

if your method overrides one of its superclass's methods, you can invoke the overridden method through the use of the keyword super.

```java
public class Superclass {

    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}
```

Here is a subclass, called Subclass, that overrides printMethod();

```java
public class Subclass extends Superclass{
    // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();
    }
}
```

### Subclass Constructors

- to invoke a superclass's constructor
- super class constructor msut be the first line in the subclass constructor
