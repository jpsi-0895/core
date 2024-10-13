
class Animal {
    void voice() {
        System.out.println("This is animal class!!!");
    }
}

public class Bounded {
    static <T extends Animal> void makeSound(T animal) {
        animal.voice();
    }

    public static void main(String[] args) {
        System.out.println("Hello, this is Bounded Type");
    }
}
