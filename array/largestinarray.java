package array;

import java.util.Scanner;
/* package array;

import java.util.Scanner;

public class largestinarray {
    public static int Larger(int arr[]) {
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest) {
                Largest = arr[i];
            }

        }
        return Largest;
    }

    public static int index(int index, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Larger(arr)) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array list is:");
        System.out.print(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5] + " "
                + arr[6] + " " + arr[7] + " " + arr[8] + " " + arr[9]);

        int LargestNumber = Larger(arr);
        System.out.println("Largest nmber in an array is : " + LargestNumber);
        int index = 0;
        System.out.println("largest number is on the index at " + index(index, arr));
        sc.close();
    }

}
 */

public class largestinarray {
    public static int Larger(int arr[]) {
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        int Largerindex = 0;
        int Smallerindex = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > Largest) {
                Largest = arr[i];
                Largerindex = i;
            }

            if (arr[i] < Smallest) {
                Smallest = arr[i];
                Smallerindex = i;
            }
        }

        System.out.println("Largest element is " + Largest + " index at " + Largerindex);
        System.out.println("Smallest element is " + Smallest + " index at " + Smallerindex);
        return Largest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array list is:");
        System.out.print(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5] + " "
                + arr[6] + " " + arr[7] + " " + arr[8] + " " + arr[9]);
        System.out.println();
        Larger(arr);
        sc.close();
    }

}
