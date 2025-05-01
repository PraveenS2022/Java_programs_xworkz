package OOPS.Abstraction;

// Abstract Class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Regular method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (inheriting from abstract class)
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
// Main Class
public class Abstract11{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();  // Abstract method implemented by Dog
        myDog.eat();    // Inherited concrete method
    }
}