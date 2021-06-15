
package basicChallengeCodes;

public class decimalComparator {
    public static void main(String[] args) {

        dayOftheWeek(0);
        dayOftheWeek(1);
        dayOftheWeek(2);
        dayOftheWeek(3);
        dayOftheWeek(4);
        dayOftheWeek(5);
    }

    public static void printNumberInWord(int number) {

        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("OTHER");
                break;
        }

    }

    public static void dayOftheWeek(int day) {
        if (day == 0) {
            System.out.println("SUNDAY");
        } else if (day == 1) {
            System.out.println("MONDAY");
        } else if (day == 2) {
            System.out.println("TUESDAY");
        } else if (day == 3) {
            System.out.println("WEDNESDAY");
        } else if (day == 4) {
            System.out.println("THURSDAY");
        } else if (day == 5) {
            System.out.println("FRIDAY");
        } else {
            System.out.println("SATURDAY");
        }

    }

}
