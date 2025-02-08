public class SwitchStatement {
    public static void main(String[] args) {

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                System.out.println("Value is 3");
                break;
            default:
                System.out.println("Value is 4");
                break;
        }

        String month = "January1";

        System.out.println(month + "is a " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August" -> "3rd";
            default -> {
                String badResponse = month + " is not a quarter";
                yield badResponse;
            }
        };
    }
}
