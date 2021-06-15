package basicChallengeCodes;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter age: ");
        // Numerical input
        int age = myObj.nextInt();// next int only takes one int value and skips the next user values if we use
                                  // the int value before strings
        myObj.nextLine();// therfore we specify the nextline property to allow the system to take inputs
                         // from next line or arguments

        System.out.println("Enter name ");
        // String input

        String name = myObj.nextLine();

        System.out.println("Enter salary:");

        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);

        System.out.println("Salary: " + salary);
        myObj.close();
    }
}
