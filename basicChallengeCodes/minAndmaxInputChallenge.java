package basicChallengeCodes;

import java.util.Scanner;

public class minAndmaxInputChallenge {

    public static void main(String[] args) {
        int max = -2147483647;
        int min = 2147483647;
        boolean first = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers and press any key to find the min and max ");
        while (true) {

            boolean isInt = scanner.hasNextInt();// to check the given input is int
            if (isInt) {
                int number = scanner.nextInt();
                // here we set the min and max to the first number enterd by user
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                } else {
                    if (number < min) {
                        min = number;
                    }
                }

            } else {

                break;
            }
        }
        System.out.println("minimum number = " + min + " maximum number = " + max);
        scanner.close();

    }
}
