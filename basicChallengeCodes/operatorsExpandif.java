
package basicChallengeCodes;

public class operatorsExpandif {

    public static void main(String[] args) {
        double firstdouble = 20.00;
        double seconddouble = 80.00;

        double result = (firstdouble + seconddouble) * 100;
        System.out.println(result);

        double reminder = result % 43.0;
        System.out.println("reminder=" + reminder);
        boolean mybool = true;

        // if (reminder == 0) {
        // mybool = true;
        // }

        if (!mybool) {
            System.out.println("Got some reminder");
        }
    }

}
