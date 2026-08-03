package AdvancePatterns;

public class Pattrn1 {
    public static void Hollow_Rectangle(int Totalrows, int Totalcols) {
        for (int i = 1; i <= Totalrows; i++) { // outer loop
            for (int j = 1; j <= Totalcols; j++) {
                if (i == 1 || i == Totalrows || j == 1 || j == Totalcols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_Rectangle(4, 5);
    }

}
