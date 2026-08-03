public class varpractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 56;
        String name = "Sonamjain";
        System.out.println(name);
        // in double quotes it exactly prints the same statement
        System.out.println("a");
        // without double quotres it will the access the variable data and prints it
        System.out.println(a);
        // in double quotes it exactly prints the same statement
        System.out.println("b");
        // without double quotres it will the access the variable data and prints it
        System.out.println(b);
        // now if i want to chnage the value of a i can change it directly without
        // redeclaring it
        a = 80;
        System.out.println(a);

        name = "Saritajain";
        System.out.println(name);

        a = b;
        System.out.println(a);

    }
}
