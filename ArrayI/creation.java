package ArrayI;

import java.util.Scanner;

public class creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creation
        int arr[] = new int[5];
        int arr2[] = { 1, 2, 3, 4, 5 };
        String name[] = { "Sonam", "Arpita", "Shreya" };
        // printing the name array
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        // taking value of arr array
        // insertion
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // updation
        arr[3] += 5;
        arr[4] += 15;

        // printing
        // prinitng the value of arr array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // printing the values of arr2 array
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        sc.close();

    }

}
