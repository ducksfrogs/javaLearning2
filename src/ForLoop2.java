public class ForLoop2 {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 0; counter<3 && i < 50; i++) {
            if(isPrime(i)) {
                System.out.println("number " + i + " is prime");
                counter++;
//                if(counter == 5) {
//                    System.out.println("Fount 3 ecitnigsd");
//                    break;
//                }
            }
        }


        System.out.println("Hello World");

    }
    public static boolean isPrime(int wholeNumber) {

        if(wholeNumber <=2){
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor < wholeNumber / 2; divisor++) {
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }

}
