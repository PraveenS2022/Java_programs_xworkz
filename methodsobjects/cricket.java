package methodsobjects;

/////////////Static

public class cricket {
    static String players;
static void batsman(){
    System.out.println("Ok Bat");
}
}

class toss{
    public static void main(String[] args) {
        cricket.players="IPL";
        cricket.batsman();
    }
}
