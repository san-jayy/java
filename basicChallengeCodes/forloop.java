
package basicChallengeCodes;

public class forloop {
    public static void main(String[] args) {
        for (int i = 8; i > 1; i--) {
            double intrest = intrestCalculator(10000, i);
            System.out.println("intrest = " + String.format("%.2f", intrest));
        }

    }

    public static double intrestCalculator(double amount, double intrestrate) {
        return (amount * (intrestrate / 100));

    }
}
