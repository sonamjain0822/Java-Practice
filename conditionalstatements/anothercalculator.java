package conditionalstatements;

import java.util.Scanner;

public class anothercalculator {
    public static void main(String[] args) {
        System.out.println("--CALCULATOR--");
        Scanner sc = new Scanner(System.in);
        System.out.println("value of a is : ");
        int A = sc.nextInt();
        System.out.println("value of b is :");
        int B = sc.nextInt();
        System.out.println("enter the operator");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("addition of both operators is : " + (A + B));
                break;
            case '-':
                System.out.println("Subtraction of both operators is : " + (A - B));
                break;
            case '*':
                System.out.println("Multiplication of both operators is : " + (A * B));
                break;
            case '/':
                System.out.println("Division of both operators is : " + (A / B));
                break;
            case '%':
                System.out.println("Modulo of both operators is : " + (A % B));
                break;
            default:
                System.out.println("no operations performed");

        }
        sc.close();
    }

}
