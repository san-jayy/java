public class methods {
    public static void main(String[] args) {
        int highscore = calculator(true, 1000, 5, 200);
        System.out.println(highscore);

    }

    public static int calculator(boolean gameover, int score, int level, int bonus) {
        if (gameover) {
            int finalscore = score + (level * bonus);
            finalscore += 10000;

            return finalscore;
        }
        return 0;

    }

}