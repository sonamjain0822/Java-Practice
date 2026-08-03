package functions;

public class funcoverbypara {
    // in function overloading using parameter we can change the no.of parameters
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(5, 6, 7));
    }
}