public class MaxInArray {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 2, 15};
        System.out.println(findMax(nums));
    }
}