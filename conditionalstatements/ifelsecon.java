package conditionalstatements;

import java.util.Scanner;

public class ifelsecon {
    public static void main(String[] args) {
        System.out.println("--IF-ELSE-IF CONDITIONAL STATEMENT USE----");
        System.out.println("NOW,WE VERIFYING WHO CAN GIVE VOTE OR NOT: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("tell me your age : ");
        int age = sc.nextInt();
        if (age >= 40 && age <= 100) {
            System.out.println("u are an old age person...!");
        } else if (age >= 30 && age < 40) {
            System.out.println("u are a matured person now...!");
        } else if (age >= 18 && age < 30) {
            System.out.println("you are an adult now...!");
        } else if (age >= 10 && age < 18) {
            System.out.println("u are a teenager...!");
        } else {
            System.out.println("u are a child now..!");
        }
        sc.close();

    }

}
