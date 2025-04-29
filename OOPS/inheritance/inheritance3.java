////Hirarcail
package OOPS.inheritance;
class Vechile {
    String Company;
}

class Superbike extends Vechile{
    void f1(){
        System.out.println(Company);
    }
}

class SuperCar extends Vechile{
    void f2(){
        System.out.println(Company);
    }
}

public class inheritance3 {
    public static void main(String[] args) {
        Superbike B1=new Superbike();
        B1.Company="BMW";
        SuperCar B2=new SuperCar();
        B2.Company="Audi";

        B1.f1();
        B2.f2();

    }
}


