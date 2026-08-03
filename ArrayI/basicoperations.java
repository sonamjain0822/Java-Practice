package ArrayI;

import java.util.Scanner;

public class basicoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("can u please enter ur name");
        String name = sc.nextLine();
        int marks[] = new int[5];
        System.out.println("Enter ur marks");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("--------STUDENT DETAILS---------");
        System.out.println("================================");
        System.out.println("Student name is :" + name);
        System.out.println("Physics marks : " + marks[0]);
        System.out.println("Chemistry marks : " + marks[1]);
        System.out.println("Biology marks : " + marks[2]);
        System.out.println("Humanology marks : " + marks[3]);
        System.out.println("Emotions marks : " + marks[4]);

        float Percentage = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;
        System.out.println("Percentage of you student is:" + Percentage);

        System.out.println("===================================");
        sc.close();
    }

}
