
package basicChallengeCodes;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabyteValue = kiloBytes / 1024;

        int kiloByteValue = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.err.println(kiloBytes + " KB = " + megabyteValue + " MB and " + kiloByteValue + " KB");
        }

    }

}
