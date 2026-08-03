package ArrayI;

public class linearsearch {
    public void LinearSearch(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                System.out.println("found at index " + i);
            } else {
                continue;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        linearsearch l1 = new linearsearch();
        l1.LinearSearch(arr);

    }
}