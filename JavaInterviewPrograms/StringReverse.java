public class StringReverse {
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}