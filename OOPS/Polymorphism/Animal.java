package OOPS.Polymorphism;
///////////////////////////////////////////compile polymorphism
class Tiger{
    int color(int a,int b){
        return  a-b;
    }
        }
        class Lion{
    String color(String brown,String black){
        return brown+black;
    }
        }
        
public class Animal {
    public static void main(String[] args) {
        Tiger t1=new Tiger();
        int ok=t1.color(10,5);
        System.out.println(ok);

        Lion l1=new Lion();
        String fine=l1.color("good","very good");
        System.out.println(fine);
    }
}
