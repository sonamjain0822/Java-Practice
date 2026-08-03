package typeconverion;

public class explicitcasting {
    public static void main(String[] args) {

        // DOUBLE
        double d = 67.89;

        long dToLong = (long) d;
        int dToInt = (int) d;
        short dToShort = (short) d;
        byte dToByte = (byte) d;

        System.out.println("Double value : " + d);
        System.out.println("Double to Long : " + dToLong);
        System.out.println("Double to Int : " + dToInt);
        System.out.println("Double to Short : " + dToShort);
        System.out.println("Double to Byte : " + dToByte);

        System.out.println();

        // FLOAT
        float f = 45.99f;

        int fToInt = (int) f;
        short fToShort = (short) f;
        byte fToByte = (byte) f;

        System.out.println("Float value : " + f);
        System.out.println("Float to Int : " + fToInt);
        System.out.println("Float to Short : " + fToShort);
        System.out.println("Float to Byte : " + fToByte);

        System.out.println();

        // LONG
        long l = 130L;

        float lToFloat = (float) l;
        int lToInt = (int) l;
        short lToShort = (short) l;
        byte lToByte = (byte) l;

        System.out.println("Long value : " + l);
        System.out.println("Long to Float : " + lToFloat);
        System.out.println("Long to Int : " + lToInt);
        System.out.println("Long to Short : " + lToShort);
        System.out.println("Long to Byte : " + lToByte);

        System.out.println();

        // INT
        int i = 130;

        short iToShort = (short) i;
        byte iToByte = (byte) i;

        System.out.println("Int value : " + i);
        System.out.println("Int to Short : " + iToShort);
        System.out.println("Int to Byte : " + iToByte);

        System.out.println();

        // SHORT
        short s = 130;

        byte sToByte = (byte) s;

        System.out.println("Short value : " + s);
        System.out.println("Short to Byte : " + sToByte);

        char ch = 'a';
        char ch1 = 'b';
        int number1 = ch;
        int number2 = ch1;
        System.out.println(number1);
        System.out.println(number2);
    }

}