package methodsobjects;

public class lion {
    static String color;
    static void zoo(){
        System.out.println(color);
    }
}

class forest{
    public static void main(String[] args) {
    lion.color="white";
    lion.zoo();
    }
}