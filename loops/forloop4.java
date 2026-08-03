package loops;

public class forloop4 {
    public static void main(String[] args) {
        int n = 10899;
        int reverse = 0;
        while (n > 0) {
            int Lastdigit = n % 10;
            n = n / 10;
            reverse = (reverse * 10) + Lastdigit;
            System.out.println();
            System.out.print(reverse);
        }
        System.out.println();

    }

}
