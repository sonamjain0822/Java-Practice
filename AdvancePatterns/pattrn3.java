package AdvancePatterns;

public class pattrn3 {

    public static void HALF_PYRAMID_WITH_NUMBERS(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("THE  HALF_PYRAMID_WITH_NUMBERS PATTERN:");
        HALF_PYRAMID_WITH_NUMBERS(5);

    }
}
