public class KeyWords {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highScore = (int) (kilometers * 100);

        int health = 100;
        if ((health < 25) || (kilometers > (int) (kilometers * 0.1) )) {
            System.out.println("You got a high score of " + highScore);
        }
        System.out.println(highScore);

    }
}
