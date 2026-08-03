package array;

public class linearsearch {
    public static int LINEAR_SEARCH(int arr[], int keys) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == keys) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 22, 33, 44, 55, 66, 77, 88, 89, 99, 90 };
        int keys = 88;
        int index = LINEAR_SEARCH(arr, keys);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println(keys + "key found at the index" + index);
        }

        keys = 100;
        index = LINEAR_SEARCH(arr, keys);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println(keys + "key found at the index" + index);
        }
    }

}
