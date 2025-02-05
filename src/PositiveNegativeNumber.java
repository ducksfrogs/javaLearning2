public class PositiveNegativeNumber {
    public static void checkNumber(int number) {
        if (number < 0) {
            System.out.println("Negative number: ");
        } else if (number > 0) {
            System.out.println("Positive number: ");
        } else {
            System.out.println("Zero");
        }
    }
}
