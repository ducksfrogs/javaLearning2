public class ForLoopChallenge {
    public static void main(String[] args) {
        int countOfMatches = 0;
        int sumOfMatches = 0;

        for (int i = 0; i <= 1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                countOfMatches ++;
                sumOfMatches += i;
                System.out.println("Fonud a match " + i);
            }

            if(countOfMatches == 5) {
                break;
            }

        }

        System.out.println("sum = " + sumOfMatches);
    }
}
