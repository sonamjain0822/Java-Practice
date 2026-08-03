package ArrayI;

import java.util.Scanner;

public class inputeverything {
    public void Linearsearch(int arr[], Scanner sc) {
        System.out.println("the array lisy you give is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n Enter the key u wanted to find in the array");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the elements of the array \n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        inputeverything i1 = new inputeverything();
        i1.Linearsearch(arr, sc);
        sc.close();
    }

}
