package ArrayI;

public class smallestarray {
    public void SMALLESTArray(int arr[]) {
        int SMALLEST = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < SMALLEST) {
                SMALLEST = arr[i];
            } else {
                continue;
            }

        }
        System.out.println(SMALLEST + "is the smallest value in the array");
    }

    public static void main(String[] args) {
        int arr[] = { 26, 28, 33, 21, 83, 99, 32, 45, 73, 54 };
        smallestarray l1 = new smallestarray();
        l1.SMALLESTArray(arr);

    }

}
