package operators;

public class preceedance {

    public static void main(String[] args) {

        // 1. Postfix
        int a = 5;
        System.out.println("Postfix a++ : " + a++);
        System.out.println("Value of a : " + a);

        // 2. Prefix
        int b = 5;
        System.out.println("Prefix ++b : " + ++b);

        // 3. Multiplicative
        System.out.println("10 * 2 = " + (10 * 2));
        System.out.println("10 / 2 = " + (10 / 2));
        System.out.println("10 % 3 = " + (10 % 3));

        // 4. Additive
        System.out.println("10 + 5 = " + (10 + 5));
        System.out.println("10 - 5 = " + (10 - 5));

        // 5. Shift
        System.out.println("4 << 1 = " + (4 << 1));/*
                                                    * 4 = 00000100
                                                    * 
                                                    * 4 << 1
                                                    * 
                                                    * 00000100
                                                    * 00001000
                                                    * 
                                                    * Answer = 8
                                                    */
        System.out.println("8 >> 1 = " + (8 >> 1));/*
                                                    * 8 = 00001000
                                                    * 
                                                    * 8 >> 1
                                                    * 
                                                    * 00001000
                                                    * 00000100
                                                    * 
                                                    * Answer = 4
                                                    */

        // 6. Relational
        System.out.println("10 > 5 : " + (10 > 5));
        System.out.println("10 < 5 : " + (10 < 5));
        System.out.println("10 >= 10 : " + (10 >= 10));
        System.out.println("10 <= 5 : " + (10 <= 5));

        // 7. Equality
        System.out.println("10 == 10 : " + (10 == 10));
        System.out.println("10 != 5 : " + (10 != 5));

        // 8. Bitwise AND
        System.out.println("5 & 3 = " + (5 & 3));/*---AND (&) = dono 1 → 1--
                                                  * 101(5)
                                                  * 011(3)
                                                  * ---
                                                  * 001 = 1
                                                  */

        // 9. Bitwise XOR
        System.out.println("5 ^ 3 = " + (5 ^ 3));/*----XOR (^) = alag-alag → 1, same → 0----
                                                  * 101(5)
                                                  * 011(3)
                                                  * ---
                                                  * 110 = 6
                                                  */

        // 10. Bitwise OR
        System.out.println("5 | 3 = " + (5 | 3));/*----OR (|) = koi ek 1 → 1----
                                                  * 101(5)
                                                  * 011(3)
                                                  * ---
                                                  * 111 = 7
                                                  */

        // 11. Logical AND and LOGICAL OR
        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);

        // 13. Ternary
        int max = (10 > 5) ? 10 : 5;
        System.out.println("Ternary Result : " + max);

        // 14. Assignment
        int c = 10;
        c += 5;
        System.out.println("c += 5 : " + c);

        // Precedence Examples
        System.out.println("2 + 3 * 4 = " + (2 + 3 * 4));
        System.out.println("(2 + 3) * 4 = " + ((2 + 3) * 4));

        System.out.println("10 > 5 && 8 < 2 = " + (10 > 5 && 8 < 2));

        System.out.println("10 == 10 || 5 > 10 = " + (10 == 10 || 5 > 10));
    }

}
