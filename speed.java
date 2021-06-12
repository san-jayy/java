import java.lang.reflect.Method;

import org.graalvm.compiler.nodes.calc.IntegerLessThanNode.LessThanOp;

/**
 * speed
 */
public class speed {

    public static void main(String[] args) {

        // long some = toMilesPerHour(-2);
        // System.out.println(some);
        printConversion(-2);

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesperhour = toMilesPerHour(kilometersPerHour);

            System.out.println(kilometersPerHour + " km/h =" + milesperhour + " mi/h");
        }

    }
}