package functions;

import java.util.*;

public class fnarguments {

    public static int sum(Scanner sc) {

        System.out.println("enter value of a:");
        int a = sc.nextInt();

        System.out.println("enter value of b:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum of a and b is :" + sum);
        return sum;
    }

    static void name(byte var0, byte var1) {
        var0 = 56;
        var1 = 67;
        System.out.println(var0 + var1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int returnsum = sum(sc);
        System.out.println("value of sum is " + returnsum);

        name((byte) 2, (byte) 3);
        sc.close();
    }
}
