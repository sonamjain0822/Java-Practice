package functions;

public class bintodec {
    /*
     * public static int Decimal(int n, int decimal) {
     * 
     * decimal = 0;
     * for (int i = 0; n > 0; i++) {
     * int Lastdigit = n % 10;
     * decimal = decimal + (Lastdigit * (int) Math.pow(2, i));
     * n = n / 10;
     * 
     * }
     * return decimal;
     * }
     */
    public static int Decimal(int n, int decimal, int pow) {
        pow = 0;
        decimal = 0;
        while (n > 0) {
            int Lastdigit = n % 10;
            decimal = decimal + (Lastdigit * (int) Math.pow(2, pow));
            n = n / 10;
            pow++;

        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(Decimal(10110, 0, 0));
    }

}
