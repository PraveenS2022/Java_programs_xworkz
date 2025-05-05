public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int start = 0, maxLength = 1;
        for (int i = 0; i < s.length(); i++) {
            int low = i - 1, high = i + 1;
            while (high < s.length() && s.charAt(high) == s.charAt(i)) high++;
            while (low >= 0 && s.charAt(low) == s.charAt(i)) low--;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--; high++;
            }
            int len = high - low - 1;
            if (len > maxLength) {
                maxLength = len;
                start = low + 1;
            }
        }
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // Output: "bab" or "aba"
    }
}