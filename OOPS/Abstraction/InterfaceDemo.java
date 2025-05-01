package OOPS.Abstraction;

// Interface
interface Operation {
    void show();      // abstract method
    int calculate();  // abstract method
}
// Class implementing the interface
class Addition implements Operation {
    int a, b;

    Addition(int x, int y) {
        a = x;
        b = y;
    }
    @Override
    public void show() {
        System.out.println("Performing Addition");
    }
    @Override
    public int calculate() {
        return a + b;
    }
}
// Main Class
public class InterfaceDemo {
    public static void main(String[] args) {
        Addition add = new Addition(10, 20);
        add.show();
        System.out.println("Result: " + add.calculate());
    }
}
