import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("value of r is : ");
        int radius = sc.nextInt();
        float pi = 3.14f;

        float areaofcircle = pi * radius * radius;

        System.out.println("area of circle is : " + areaofcircle);

        sc.close();

    }

}
