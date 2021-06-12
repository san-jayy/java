public class sumDigit {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));

    }

    public static boolean isPalindrome(int number) {
        int Reverse = 0;
        int num = number;
        while (number > 0) {

            int lastDegit = num % 10;
            Reverse = 10 * Reverse;
            Reverse = Reverse + lastDegit;

            num = num / 10;
        }

      return number==Reverse;

}