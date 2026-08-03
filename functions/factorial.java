package functions;

public class factorial {
    public static int fact(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        return fact;
    }

    public static void main(String[] args) {
        fact(8);
    }

}
