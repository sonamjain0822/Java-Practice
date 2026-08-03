import java.util.Scanner;

public class inpsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();

        int c = a + b;
        System.out.println("-----SUM OF TWO VALUES IN WHICH INPUT IS TAKEN BY USER:--------");
        System.out.println("value of a" + " " + a + " " + "\nvalue of b" + " " + b + " " + "is :" + c);
        sc.close();

    }

}
