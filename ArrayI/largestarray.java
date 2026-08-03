package ArrayI;

public class largestarray {
    public void LargestArray(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else {
                continue;
            }

        }
        System.out.println(largest + "is the largest value in the array");
    }

    public static void main(String[] args) {
        int arr[] = { 26, 28, 33, 21, 83, 99, 32, 45, 73, 54 };
        largestarray l1 = new largestarray();
        l1.LargestArray(arr);

    }

}
