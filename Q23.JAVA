public class Pattern1 {
    public static void main(String[] args) {
        int number = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}


public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            // Print leading spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
