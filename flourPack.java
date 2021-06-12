public class flourPack {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        bigCount = bigCount * 5;
        smallCount = smallCount * 1;
        while (goal >= 0 && bigCount >= 0 && smallCount >= 0) {
            int mingoal = goal - bigCount;

            while (mingoal < smallCount) {
                if (goal == bigCount + (mingoal) && mingoal >= 0) {
                    return true;

                } else {
                    return false;
                }
            }
        }
        return false;
    }

}
