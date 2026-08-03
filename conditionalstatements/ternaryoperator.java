package conditionalstatements;

public class ternaryoperator {
    public static void main(String[] args) {
        // ternary operator
        int A = 5;
        int B = 3;
        int larger = (A > B) ? A : B;
        System.out.println(larger);

        int num = 6;
        String type = (num % 2 == 0) ? "even" : "odd";
        System.out.println(type);

        // check if student is pass or fail (marks>33 = pass) and (marks <=33 = fail)
        int marks = 29;
        String status = (marks > 33) ? "pass" : "fail";
        System.out.println("student is : " + status);
    }

}
