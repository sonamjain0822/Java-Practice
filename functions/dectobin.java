package functions;

//decimal to binary conversion
public class dectobin {
    /*
     * public static int Binary(int n, int binary, int pow) {
     * pow = 0;
     * binary = 0;
     * while (n > 0) {
     * int remainder = n % 2;
     * binary = binary + (remainder * (int) Math.pow(10, pow));
     * n = n / 2;
     * pow++;
     * 
     * }
     * return binary;
     * }
     */
    public static int Binary(int n, int binary) {
        binary = 0;
        for (int i = 0; n > 0; i++) {
            int remainder = n % 2;
            binary = binary + (remainder * (int) Math.pow(10, i));
            n = n / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        System.out.println(Binary(5, 0));
    }

}
