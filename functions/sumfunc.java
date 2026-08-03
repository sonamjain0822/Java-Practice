package functions;

import java.util.Scanner;

public class sumfunc {

    public static int sum(Scanner sc) {

        System.out.println("enter value of a:");
        int a = sc.nextInt();

        System.out.println("enter value of b:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum of a and b is :" + sum);
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int returnsum = sum(sc);
        System.out.println("value of sum is " + returnsum);

        sc.close();
    }
}