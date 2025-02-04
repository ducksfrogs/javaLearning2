public class IfThen {
    public static void main(String[] args) {

        System.out.println("Hello World");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Alien");
        }

        int topScore = 100;
        if (topScore <= 100) {
            System.out.println("You got the High Score");
        }

        int secondTopScore = 60;
//        if ((topScore >secondTopScore)  || (topScore < 60)) {
        if ((topScore > secondTopScore) && (topScore < 60)) {
            System.out.println("You got the lkow Score");
        }

        if ((topScore > 90) || (secondTopScore == 90)){
            System.out.println("You got the second High Score");
        }

        if ((topScore > 80) || (secondTopScore <= 90)){
            System.out.println("You git the second High Score");
        }

        int newValue = 50;
        if (newValue <= 50) {
            System.out.println("You got Score");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("Car");
        }




    }
}
