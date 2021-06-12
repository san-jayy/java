
public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 8));

    }

    public static boolean shouldWakeUp(boolean barking, int hourofDay) {

        if (barking) {
            if (hourofDay < 0 || hourofDay > 23) {
                return false;
            }

            else if (hourofDay < 8 || hourofDay > 22) {
                return true;
            } else {
                return false;
            }

        }

        else {
            return false;
        }

    }

}
