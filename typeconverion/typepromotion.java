package typeconverion;

public class typepromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        int sum = (int) b - a + b * a;
        System.out.println("value of b is : " + (int) (b));
        System.out.println("value of a is : " + (int) (a));

        System.out.println("output is : " + (int) (b - a));
        System.out.println("output is : " + (b + a));
        System.out.println("output is : " + (b - a * a));
        System.out.println("output is : " + sum);

        short c = 35;
        byte d = 45;
        char e = 'e';
        byte bt = (byte) (c + d + e); // output vse 181 hota pr range -128 to 127 hai islie total 256 hota h to usse
                                      // subtract krenge
        // 256-181 = -75
        System.out.println("addition is :" + bt);

    }
}
