public class oddnumbers {
    public static void main(String[] args) {
        int limit = 50; // You can change this limit as needed

        

        System.out.println("\n\nOdd numbers:");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
 }
