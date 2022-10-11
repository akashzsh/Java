import java.util.Arrays;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int rows = intervals.length;
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Logic
        for (int i = 1; i < rows; i++) {
            if ((intervals[i - 1][1] > intervals[i][0]) && (intervals[i - 1][1] < intervals[i][1]))
                end = intervals[i][1];
            else {
                System.out.print("[" + start + ", " + end + "]" + ", ");
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        System.out.println("[" + start + ", " + end + "]");
    }
}
