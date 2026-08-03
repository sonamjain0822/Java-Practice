package typeconverion;

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        int a = 50;
        long b = a;
        System.out.println("type conversion of a to b is : " + b);

        Scanner sc = new Scanner(System.in);
        /*
         * int hello = sc.nextFloat(); here this statement gives an error because if we
         * take input in float
         * and try to store it in int then its a losssy conversion
         */
        float hello = sc.nextFloat();
        System.out.println(hello);

        sc.close();
    }// we can't convert big data type to smaller datatype otherwise it gives the
     // error in the code also
     // we can only follow the rule which is :
     // byte(1byte)->short(2byte)->int(4byte)->float(4byte)->long(8byte)->double(8byte)

}
