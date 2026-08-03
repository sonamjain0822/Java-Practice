package array;

import java.util.*;

public class reversearray {
    /*
     * public class reversearray {
     * public static void Reversearray(int arr[]) {
     * System.out.println("REVERSE ARRAY LIST IS ");
     * for (int i = arr.length - 1; i >= 0; i--) {
     * System.out.println(arr[i]);
     * }
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * int arr[] = new int[10];
     * for (int i = 0; i < arr.length; i++) {
     * arr[i] = sc.nextInt();
     * }
     * System.out.print(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " +
     * arr[4] + " " + arr[5] + " "
     * + arr[6] + " " + arr[7] + " " + arr[8] + " " + arr[9]);
     * System.out.println();
     * Reversearray(arr);
     * sc.close();
     * }
     */
    public static void Reversearray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;

        }
        System.out.println("reversed array is:");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("enter array's list elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("GIVEN ARRAY LIST:");
        System.out.print(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5] + " "
                + arr[6] + " " + arr[7] + " " + arr[8] + " " + arr[9]);
        System.out.println();
        Reversearray(arr);
        sc.close();

    }
}
