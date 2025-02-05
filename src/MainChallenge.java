public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = false;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if(gameOver) {
            finalScore += bonus * levelCompleted;
            finalScore += 1000;
            System.out.println(finalScore);

        }

        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    public static void calculateScore(boolean newGameOver, int newScore, int newLevel, int newBonus) {

        int newFinalScore = 0;

        if (newGameOver) {
            newFinalScore += newScore + (newBonus * newLevel);
            System.out.println(newFinalScore);
        } else {
            System.out.println(newScore);
        }

    }
}
