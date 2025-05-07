class Car {
    String brand = "Toyota";
    int year = 2020;
}

public class ClassObjectExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Car Brand: " + myCar.brand);
        System.out.println("Car Year: " + myCar.year);
    }
}