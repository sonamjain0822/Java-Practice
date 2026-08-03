package ArrayI;

public class passingasargument {
    public static int[] Update(int marks[]) {
        return new int[] { 34, 45, 56, 67, 67, 78 };
    }

    public static void main(String[] args) {
        int marks[] = { 33, 45, 68, 99, 100 };
        System.out.println("Array before reassigning from function");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        marks = Update(marks);
        System.out.println("\n new Array reassigned by function");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }

}
