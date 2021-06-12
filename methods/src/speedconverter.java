public class speedconverter {

    public static void main(String[] args) {
        tomilesperHour(10);
    }

    public static long tomilesperHour(int kilometersperHours) {

        if (kilometersperHours <= 0) {
            return -1;
        }

        else {
            return Math.round(kilometersperHours / 1.609);
        }

    }
}