
package basicChallengeCodes;

public class methodoverloading {

    public static void main(String[] args) {
        // double centimeters = calcFeetAndInchesToCentimeters(6, 10);
        // System.out.println(centimeters);

        calcFeetAndInchesToCentimeters(100);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double centimeters = (feet * 12) * 2.54;
            centimeters += 2.54 * inches;
            System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " centimeters");
            return centimeters;
        } else {
            System.out.println("Invalid Value");
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double tofoot = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is = " + tofoot + " feet and " + remainingInches + " inches ");

            return calcFeetAndInchesToCentimeters(tofoot, remainingInches);
        }
        return -1;

    }
}
