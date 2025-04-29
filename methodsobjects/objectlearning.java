package methodsobjects;

////////Non Static

public class objectlearning {
    void bike(){
        System.out.println("method is calling");
    }
}

 class object1{
     public static void main(String[] args) {
         objectlearning p1=new objectlearning();
         p1.bike();
     }
 }



