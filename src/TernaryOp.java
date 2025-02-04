public class TernaryOp {
    public static void main(String[] args) {
        boolean isCar = false;

        String makeOfCar = "Volkeswagen";
//        boolean isDomestic = makeOfCar == "Volkeswagen" ? true : false;
        boolean isDomestic = makeOfCar == "Volkeswagen" ?  false : true;

        System.out.println(isDomestic);

        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Yes" : "No";
        System.out.println(ageText);

        String s = (isDomestic) ? "Yes" : "No";
        System.out.println(s);
    }
}
