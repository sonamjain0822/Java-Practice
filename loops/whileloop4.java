package loops;

import java.util.Scanner;

public class whileloop4 {

    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("value of n is :");
        int n = sc.nextInt();
        while (i < n) {
            sum = sum + i;
            System.out.println(sum);
            i++;

        }
        sc.close();
    }

}
