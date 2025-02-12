public class LoopChallenge {
    public static void main(String[] args) {
        int digit = 1234;

        digit = digit /10;
        System.out.println(sumDigits(1234));
    }
    public static int sumDigits(int num) {

        if (num < 0) {
            return -1;
        }

        int sum = 0;

        while (num > 9) {
            sum += (num % 10);
            num = num / 10;
        }
        sum += num;
        return sum;
    }
}
