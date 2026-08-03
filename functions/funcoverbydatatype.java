package functions;

public class funcoverbydatatype {
    // in function overloading using parameter we can change the types.of
    // parameters
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(5.5f, 6.9f));
    }
}
