public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "racecar";
        System.out.println(input + " is palindrome? " + isPalindrome(input));
    }
}