
//primitive types-int -long-short and byte

public class some {
    public static void main(String[] args) {

        int maxIntNumber = Integer.MAX_VALUE; // maximun number that an integer can
        store ie. 2147483647
        int minIntNumber = Integer.MIN_VALUE; // minimun number that an integer can
        store ie. -2147483648
        System.out.println("Maximum integer number = " + maxIntNumber);
        System.out.println("Minimum integer number = " + minIntNumber);

        // System.out.println(maxIntNumber + 1); here overflow takesplace as maximum
        // number that an int can hold is 2147483647 .. (+1 is not possible)
        // int occupies 32 bits

        // min and maximum value of byte
        // byte occupies 8 bits(width of byte=8)
        System.out.println("Maximum byte value=" + Byte.MAX_VALUE);
        System.out.println("Minimum byte value=" + Byte.MIN_VALUE);

        // min and maximum value of short
        // short ocupies 16 bits
        System.out.println("Maximum Short value=" + Short.MAX_VALUE);
        System.out.println("Minimum Short value=" + Short.MIN_VALUE);

        long longnum = 1272345667788888L;
        System.out.println(longnum);

        // long
        // long numbers need L to be written after the numbers for it to be
        identified
        // as long, ie. long age = 1272345667788888L;
        // min and maximum value of long
        // long ocupies 64 bits
        System.out.println("Maximum long value=" + Long.MAX_VALUE);
        System.out.println("Minimum long value=" + Long.MIN_VALUE);


    }
}
