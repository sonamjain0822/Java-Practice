package conditionalstatements;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {

        System.out.println("--IF-ELSE-IF CONDITIONAL STATEMENT USE----");
        System.out.println("NOW,WE VERIFYING which is  the largest number amongst these two : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("tell me your value of A : ");
        int A = sc.nextInt();
        System.out.println("tell me your value of B : ");
        int B = sc.nextInt();
        if (A >= B) {
            System.out.println("A is greater than B : " + A);
        } else {
            System.out.println("B is greater than A : " + B);
        }
        sc.close();
    }

}
