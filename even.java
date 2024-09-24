public class evennumbers {
    public static void main(String[] args) {
        int limit = 100; // You can change this limit as needed

        System.out.println("Even numbers:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
