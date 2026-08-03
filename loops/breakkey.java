package loops;

public class breakkey {

    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i <= 100; i++) {

            if (i % 10 == 0 && i != n) {
                continue;
            }
            System.out.println(i);
        }
    }
}