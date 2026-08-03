package loops;

import java.util.*;

public class whileloop3 {
    public static void main(String[] args) {
        // print values from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("value of n is :");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;

        }
        System.out.println("printed i to n ");
        sc.close();
    }

}
