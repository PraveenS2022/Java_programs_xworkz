package OOPS.Polymorphism;

class op{
     int add(int a,int b){
        return a+b;
    }
     int add(int a){
         return a*2;
    }
}
public class teacher {
    public static void main(String[] args) {
        op o1 = new op();
        int ok = o1.add(1, 2);
        System.out.println(ok);

        int ok1 = o1.add(5);
        System.out.println(ok1);
    }
}
