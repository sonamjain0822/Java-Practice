package array;

import java.util.Scanner;

public class bascoperations {
   public static void main(String[] args) {
      // Creation of array
      int marks[] = new int[8];
      System.out.println("");
      System.out.println("Here,right your marks so I can calculate your percentage");
      System.out.println("Enter your name:");
      // input
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      System.out.println("Enter your marks now");
      System.out.print("Enter your Physics marks : ");
      marks[0] = sc.nextInt();
      System.out.print("Enter your Chemistry marks : ");
      marks[1] = sc.nextInt();
      System.out.print("Enter your Biology marks : ");
      marks[2] = sc.nextInt();
      System.out.print("Enter your Mathematics marks : ");
      marks[3] = sc.nextInt();
      System.out.print("Enter your Physical Education marks : ");
      marks[4] = sc.nextInt();
      System.out.print("Enter your I.P  marks : ");
      marks[5] = sc.nextInt();
      System.out.print("Enter your Computer Science marks : ");
      marks[6] = sc.nextInt();
      // updation
      marks[6] = marks[6] + 8;
      marks[7] = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4] + marks[5] + marks[6]);
      System.out.println("===================================");
      System.out.println("RESULT OF THE STUDENT NAMED : " + name);
      // output
      System.out.println("Physics marks is :" + marks[0]);
      System.out.println("Chemistry marks is :" + marks[1]);
      System.out.println("Biology marks is :" + marks[2]);
      System.out.println("Mathematics marks is :" + marks[3]);
      System.out.println("Physical Education marks is :" + marks[4]);
      System.out.println("I.P marks is :" + marks[5]);
      System.out.println("Computer Science marks is :" + marks[6]);
      System.out.println("Total marks out of 700  is :" + marks[7]);

      int Percentage = marks[7] / 7;
      if (Percentage > 70) {
         System.out.println("CONGRATULATIONS..! You got " + Percentage + "%");
         System.out.println("============================================");
      } else if (Percentage >= 50 && Percentage <= 70) {
         System.out.println("GOOD..! You got " + Percentage + "%");
         System.out.println("=================================");
      } else {
         System.out.println(" You got " + Percentage + "%");
         System.out.println("==========================");
      }

      System.out.println("total subjects are :" + marks.length);

      char cont;
      do {
         System.out.println("do you want to continue (yes/no)");
         cont = sc.next().charAt(0);

      } while (cont == 'Y' || cont == 'y');
      System.out.println("Thanks for using our percentage calculator machine..!");
      System.out.println("Visit again...!");

      sc.close();

   }

}
