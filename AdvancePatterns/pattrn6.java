package AdvancePatterns;

public class pattrn6 {
    public static void ZERO_TO_ONE_TRIANGLE(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("ZERO_TO_ONE_TRIANGLE pattern");
        ZERO_TO_ONE_TRIANGLE(5);
    }

}
