package loops;

public class dowhileloop {
    public static void main(String[] args) {
        int i = 0;
        int n = 13;
        boolean isprime = true;
        for (i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        if (isprime == true) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("it is not a prime number");
        }
    }

}
