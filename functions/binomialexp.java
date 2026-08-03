package functions;

public class binomialexp {
    public static int factorialn(int n) {
        int fact1 = 1;

        for (int i = 1; i <= n; i++) {
            fact1 = fact1 * i;
        }
        System.out.println(fact1);

        return fact1;
    }

    public static int factorialr(int r) {
        int fact2 = 1;

        for (int i = 1; i <= r; i++) {
            fact2 = fact2 * i;
        }
        System.out.println(fact2);

        return fact2;
    }

    public static int factorialnr(int f) {
        int fact3 = 1;

        for (int i = 1; i <= f; i++) {
            fact3 = fact3 * i;
        }
        System.out.println(fact3);

        return fact3;
    }

    public static int binexp(int n, int r) {
        int f = n - r;
        int nf = factorialn(n);
        int rf = factorialr(r);
        int nrf = factorialnr(f);
        int binomialexpression = nf / (rf * nrf);

        return binomialexpression;
    }

    public static void main(String[] args) {
        System.out.println(binexp(8, 5));
    }

}
