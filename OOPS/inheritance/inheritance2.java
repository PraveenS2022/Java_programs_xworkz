// Multi  Inheritance
package OOPS.inheritance;

class Shape{
    String color="blue";
}
class Triangle extends Shape{
    void eno(){
        System.out.println(color);
    }
}
class MariTraingle extends Triangle{
    void enoeno(){
        System.out.println(color);
    }
}
public class inheritance2 {
    public static void main(String[] args) {
        MariTraingle m1=new MariTraingle();
        m1.color="white";
        m1.enoeno();
    }
}
