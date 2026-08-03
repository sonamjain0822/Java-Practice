package typeconverion;

import java.util.Scanner;

//IMPLICIT CONVERSION
public class casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --BYTE TO SHORT CONVERSION--
        System.out.print("--byte value is : -- \n");
        Byte num = sc.nextByte();
        System.out.println("byte value is : " + num);
        short anum = (short) num;
        System.out.println("after converting byte value is : " + anum);

        // --SHORT TO INT CONVERSION--
        System.out.print("--SHORT value is : -- \n");
        short num1 = sc.nextShort();
        System.out.println("short value is : " + num1);
        int anum1 = (int) num1;
        System.out.println("after converting short value is : " + anum1);

        // --INT TO FLOAT CONVERSION--
        System.out.print("--INT value is : -- \n");
        int num2 = sc.nextInt();
        System.out.println("int value is : " + num2);
        float anum2 = (float) num2;
        System.out.println("after converting int value is : " + anum2);

        // --FLOAT TO LONG CONVERSION--
        System.out.print("--FLOAT value is : -- \n");
        float num3 = sc.nextFloat();
        System.out.println("byte value is : " + num3);
        long anum3 = (long) num3;
        System.out.println("after converting float value is : " + anum3);

        // --LONG TO DOUBLE CONVERSION--
        System.out.print("--LONG value is : -- \n");
        long num4 = sc.nextLong();
        System.out.println("byte value is : " + num4);
        double anum4 = (double) num4;
        System.out.println("after converting long value is : " + anum4);

        // --DOUBLE--
        System.out.print("--DOUBLE value is : -- \n");
        double num5 = sc.nextDouble();
        System.out.println("byte value is : " + num5);
        sc.close();
    }
}
