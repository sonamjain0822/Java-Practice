package functions;

public class prime {

    /*
     * public static boolean isPrime(int n) {
     * // if n is lessthan 2
     * if (n <= 1) {
     * return false;
     * }
     * boolean isPrime = true;
     * // onlly for n = 2 // corner cases
     * if (n == 2) {
     * return true;
     * }
     * for (int i = 2; i <= n - 1; i++) {
     * 
     * if (n % i == 0) {
     * isPrime = false;
     * return isPrime;
     * }
     * }
     * return isPrime;
     * }
     */
    public static boolean isPrime(int n) {
        // if n is lessthan 2
        if (n <= 1) {
            return false;
        }
        // onlly for n = 2 // corner cases
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static void Primeinrange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        return;
    }

    public static void main(String[] args) {
        Primeinrange(10);
    }
}
