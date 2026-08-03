package AdvancePatterns;

public class pattrn2 {

    // easy but time-consuming:
    /*
     * public static void InvertedPyramid(int totalRows, int totalcols) {
     * for (int i = 0; i <= totalRows; i++) {
     * for (int j = 1; j <= totalcols; j++) {
     * if (i == 1 && j == 4) {
     * System.out.print("*");
     * } else if (i == 2 && (j == 3 || j == 4)) {
     * System.out.print("*");
     * } else if (i == 3 && (j == 2 || j == 3 || j == 4)) {
     * System.out.print("*");
     * } else if (i == 4) {
     * System.out.print("*");
     * } else {
     * System.out.print(" ");
     * }
     * }
     * System.out.println();
     * }
     * }
     */
    public static void InvertedPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        InvertedPyramid(5);

    }
}