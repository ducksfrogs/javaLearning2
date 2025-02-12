public class WhileLoopChallenge2 {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println(number);
            evenCount++;

            if (evenCount >=5 ) {
                break;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
