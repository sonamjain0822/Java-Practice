package conditionalstatements;

public class largeinthree {
    public static void main(String[] args) {
        int A = 16, B = 9, C = 6;
        if ((A >= B) && (A >= C)) {
            System.out.println("A is greater than B or C:" + A);
        } else if (B >= C) { // we are not writing here B >= A cuz in condition 1 we already checked Ais
                             // greater than b or not if not then it means surely a is less tha b so we can
                             // check further for C
            System.out.println("B is greater than A or C:" + B);
        } else {
            System.out.println("C is greater than A or B:" + C);
        }

    }
}
