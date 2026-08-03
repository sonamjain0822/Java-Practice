package functions;

public class callbyvalue {
    public static int sum(int a, int b) {
        a = 33;
        b = 45;
        int sum = a + b;
        System.out.println("in sum function value of a is : " + a);
        System.out.println("in sum function value of b is : " + b);
        return sum;

    }

    // here we only passed the copy of a and b to the (name)function parameters a
    // and b
    // if we make any changes in value of a and b then it these changes will be only
    // inside the function but in the main function the original values remain
    // unchanged and its called call by value in function
    /*
     * Call by Value: 
     * When we
     * pass a
     * variable to
     * a function, the
     * function receives
     * a copy
     * of that variable's
     * value.
     * 
     * If we
     * change the
     * parameter value
     * inside the function,
     * the original
     * variable remains
     * unchanged because
     * only a
     * copy was passed.
     */

    public static void main(String[] args) {
        int a = 45;
        int b = 65;
        sum(a, b);
        System.out.println("in main function value of a is : " + a);
        System.out.println("in main function value of b is : " + b);
    }

}
