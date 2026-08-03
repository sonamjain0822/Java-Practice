package functions;

public class product {
    public static int mul(int a, int b) {
        a = 12;
        b = 12;
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        mul(a, b);
        System.out.println(mul(a, b));
        System.out.println(a);
        System.out.println(b);
        int multiply = a * b;
        System.out.println(multiply);

    }

}
