public class deciConverter {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-1.123, -1.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double paper, double pencil) {
        int num1 = (int) (paper * 1000);
        int num2 = (int) (pencil * 1000);

        return (num1 == num2);
    }

}
