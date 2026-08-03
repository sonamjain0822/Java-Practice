import java.util.Scanner;

public class inputjava {
    // Main method: program execution starts here
    public static void main(String[] args) {

        // Create a Scanner object named input
        // System.in means keyboard input
        Scanner input = new Scanner(System.in);

        // ---NEXT METHOD----
        System.out.print("Enter your name: ");
        String name = input.next();
        input.nextLine();

        // ---NEXTLINE METHOD----
        System.out.print("Enter your bio: \n");
        String bio = input.nextLine();

        // ---NEXTBYTE METHOD----
        System.out.print("Enter your count: \n");
        byte count = input.nextByte();

        // ---NEXTSHORT METHOD----
        System.out.print("Enter your age: \n ");
        short age = input.nextShort();

        // ---NEXTINT METHOD----
        System.out.print("Enter your salary: \n");
        int salary = input.nextInt();

        // ---NEXTFLOAT METHOD----
        System.out.print("Enter VALUE OF PI: \n");
        float pi = input.nextFloat();

        // ---NEXTIlong METHOD----
        System.out.print("Enter your pricevalue: \n ");
        long price = input.nextLong();

        // --NEXTDOUBLE--
        System.out.print("Enter your yearly package: \n");
        double Package = input.nextDouble();

        // --NEXTBOOLEAN--
        System.out.print("are you follow him : \n ");
        boolean isfollow = input.nextBoolean();

        // Display all values entered by the user
        System.out.println("\n----- User Details -----");

        // Print the value stored in name
        System.out.println("Name: " + name);
        System.out.println("bio: " + bio);
        System.out.println("count: " + count);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("pi: " + pi);
        System.out.println("price: " + price);
        System.out.println("package: " + Package);
        System.out.println("isfollow: " + isfollow);

        // Close the Scanner object
        // Good practice to free resources
        input.close();

    }

}
