public class WhileLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("====");

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }
        System.out.println("IS READY====");

        j = 1;
        boolean isReady = false;
        isReady = true;
        do {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        } while (isReady);

        System.out.println("done");
    }
}
