public class durationString {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;

                if (count < 6) {
                    sum = sum + i;

                    System.out.println(sum);
                }

            }

        }

    }

    // public static void main(String[] args) {

    // System.out.println(duSeconds(6630));
    // }

    // public static String timeDurationString(int minutes, int seconds) {

    // if (minutes < 0 || (seconds < 0 || seconds > 59)) {
    // return "Invalid Input";

    // } else {
    // int hour = minutes / 60;
    // int rem_mins = minutes % 60;
    // return hour + " hr " + rem_mins + " min " + seconds + " sec";
    // }

    // }

    // public static String duSeconds(int seconds) {
    // if (seconds <= 0) {
    // return " ----------Not in Time Limits----------";
    // } else {
    // int mins = seconds / 60;
    // int secs = seconds % 60;

    // return timeDurationString(mins, secs);
    // }

    // }
}
