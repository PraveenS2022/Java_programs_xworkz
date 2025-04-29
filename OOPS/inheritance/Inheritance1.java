// Single Inheritance

package OOPS.inheritance;

class animal{
    String Name="tomy";
}

class dog extends animal{
    void sound(){
        System.out.println(Name);
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        dog d1=new dog();
        d1.Name="logi"; // if need assign this line thw output is tomy
        d1.sound();
    }
}

