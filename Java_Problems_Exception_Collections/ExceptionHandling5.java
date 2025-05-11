public class ExceptionHandling5 {
    public static void main(String[] args) {
        try {
            throw new Exception("Custom exception thrown");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}