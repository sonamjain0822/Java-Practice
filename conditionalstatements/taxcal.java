package conditionalstatements;

import java.util.Scanner;

public class taxcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how much u earn in a year");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income <= 1000000) {
            tax = income * 20 / 100;
        } else {
            tax = income * 30 / 100;
        }
        System.out.println("your tax is : " + tax);
        sc.close();
    }

}
