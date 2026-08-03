package conditionalstatements;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        System.out.println("--CALCULATOR--");
        Scanner sc = new Scanner(System.in);
        System.out.println("value of a is : ");
        int A = sc.nextInt();
        System.out.println("value of b is :");
        int B = sc.nextInt();
        System.out.println("choose any one operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication");
        System.out.println("4. Division ");
        System.out.println("5. Modulo ");
        int operator = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println("addition of both operators is : " + (A + B));
                break;
            case 2:
                System.out.println("Subtraction of both operators is : " + (A - B));
                break;
            case 3:
                System.out.println("Multiplication of both operators is : " + (A * B));
                break;
            case 4:
                System.out.println("Division of both operators is : " + (A / B));
                break;
            case 5:
                System.out.println("Modulo of both operators is : " + (A % B));
                break;
            default:
                System.out.println("no operations performed");

        }
        sc.close();

    }

}
