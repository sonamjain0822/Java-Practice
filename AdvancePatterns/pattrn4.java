package AdvancePatterns;

public class pattrn4 {
    public static void INVERTED_HALF_PYRAMID_WITH_NUMBERS(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("INVERTED_HALF_PYRAMID_WITH_NUMBERS");
        INVERTED_HALF_PYRAMID_WITH_NUMBERS(5);

    }

}
