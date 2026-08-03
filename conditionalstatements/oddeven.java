package conditionalstatements;

import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {

        System.out.println("--IF-ELSE-IF CONDITIONAL STATEMENT USE----");
        System.out.println("NOW,WE VERIFYING which is  the even number and odd number : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("tell me your value of A : ");
        int A = sc.nextInt();

        if (A % 2 == 0) {
            System.out.println("A " + A + "is even number : ");
        } else {
            System.out.println("A " + A + "is odd number : ");
        }
        sc.close();
    }

}
