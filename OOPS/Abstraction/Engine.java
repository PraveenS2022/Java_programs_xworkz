package OOPS.Abstraction;

public interface Engine {
    void StartEngine();
    void StopEngine();
}

abstract  class Vechile{
    String brand = "bmw";
    abstract void drive();
    void horn(){
        System.out.println("beep beef");
    }
}


class car extends Vechile implements Engine{

    @Override
    public void StartEngine() {
        System.out.println("engine started");
    }

    @Override
    public void StopEngine() {
        System.out.println("engine stoped");
    }

    @Override
    void drive() {
        System.out.println("i am driving");
    }
}

 class bigmain{
     public static void main(String[] args) {
         car c1=new car();

         System.out.println(c1.brand);

         c1.drive();
         c1.StartEngine();
         c1.horn();
         c1.StopEngine();
     }
}
