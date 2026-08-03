package AdvancePatterns;

public class pattrn5 {
    public static void Floyds_Triangle(int n) {
        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Floyds_Triangle pattern");
        Floyds_Triangle(5);
    }
}
