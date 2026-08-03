package AdvancePatterns;

public class pattrn8 {
    public static void SOLID_RHOMBHUS_PATTERN(int n) {
        // lines
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        SOLID_RHOMBHUS_PATTERN(5);
    }
}