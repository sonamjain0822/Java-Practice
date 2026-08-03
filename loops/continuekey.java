package loops;

public class continuekey {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("ooppss...! i am out of the loop");

    }

}
