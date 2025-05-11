public class ExceptionHandling4 {
    public static void main(String[] args) {
        try {
            String s = "abc";
            int num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}