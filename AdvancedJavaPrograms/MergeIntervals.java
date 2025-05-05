import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        for (int[] interval : intervals) {
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0])
                result.add(interval);
            else result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
        }
        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] input = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(input);
        for (int[] r : result) System.out.println(Arrays.toString(r));
    }
}