package basicChallengeCodes;

import java.util.Scanner;

public class userInputChallenge {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order);
            boolean isInt = myScanner.hasNextInt();
            if (isInt) {
                int number = myScanner.nextInt();
                counter++;
                sum = sum + number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            myScanner.nextLine();

        }
        System.out.println("sum =" + sum);
        myScanner.close();
    }
}
