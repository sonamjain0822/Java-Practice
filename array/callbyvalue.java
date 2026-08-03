package array;

public class callbyvalue {
    // public static void Sonam(int arr[]) {
    // arr = new int[] { 23, 34, 56, 67 }; //
    // }
    // when i call this Sonam function in the main function and wanted to print the
    // new array i defined in Sonam function , but the
    // compiler prints the array which i defined in the main function, because in
    // the function
    // i tried to make a new array from arr so,if i wanted to change the array
    // elements or array,we can update there elemts and customize it according to us
    // .

    static void Sonam(int arr[]) {
        // we update the values of arr[](array) not wanted to replace it with new array
        for (int i = 0; i < arr.length; i++) {
            // here,if i write int i = 0; i <= arr.length; i++ , it gives an error because
            // elements in
            // arr is 5 and indexing value is 0 to 4 so it cant accessed tha arr[5] element
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7 };
        Sonam(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
