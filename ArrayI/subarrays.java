package ArrayI;

public class subarrays {
    public void printsubarray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int start = i;
            System.out.println("Subarray starting at index " + start + ":");
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Subarrays are");
        int number[] = { 1, 2, 3, 4, 5, 6 };
        subarrays m1 = new subarrays();
        m1.printsubarray(number);

    }
}
