package functions;

import java.util.Scanner;

public class calcsum {

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a:");
        int a = sc.nextInt();

        System.out.println("enter value of b:");
        int b = sc.nextInt();

        int returnsum = sum(a, b);
        System.out.println("value of sum is " + returnsum);

        sc.close();
    }
}
