public class ReversedPyramid {
    public static void main(String[] args) {
        int i, j, k, n = 5;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < 5 - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
