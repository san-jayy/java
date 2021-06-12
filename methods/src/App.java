public class App {
    public static void main(String[] args) {

        int playerposition;

        playerposition = calculateHighscorePosition(1500);
        displayhighscoreposition("jay", playerposition);

        playerposition = calculateHighscorePosition(900);
        displayhighscoreposition("san", playerposition);

        playerposition = calculateHighscorePosition(300);
        displayhighscoreposition("jay", playerposition);

        playerposition = calculateHighscorePosition(90);
        displayhighscoreposition("job", playerposition);
        long fibResult = fibanacci(100);
        System.out.println(fibResult);

    }

    public static void displayhighscoreposition(String playername, int playerposition) {
        System.out.println(playername + " managed to get into position " + playerposition + " on highscore table");

    }

    public static int calculateHighscorePosition(int playerscore) {
        if (playerscore >= 1000) {
            return 1;
        } else if (playerscore >= 500 && playerscore < 1000) {
            return 2;
        } else if (playerscore >= 100 && playerscore < 500) {
            return 3;
        }
        return 4;
    }

    public static long fibanacci(int n) {

        long[] fibarray = new long[n + 2];
        fibarray[0] = 0;
        fibarray[1] = 1;

        for (int i = 2; i < fibarray.length; i++) {
            fibarray[i] = fibarray[i - 1] + fibarray[i - 2];
        }
        return fibarray[n];

    }
}
