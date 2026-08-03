package operators;

public class logicaloperator {
    public static void main(String[] args) {
        int A = 45;
        int B = 65;
        System.out.println("--LOGICAL AND OPERATOR :" + (A == B && A <= B));// both are true then the answer is true
        System.out.println("--LOGICAL OR OPERATOR :" + (A == B || A <= B));// if either on e is true then the answer is
                                                                           // true
        System.out.println("--LOGICAL NOT OPERATOR :" + !(A == B));// it will give the oppsoite answer if true then
                                                                   // false, if false then true

    }

}
