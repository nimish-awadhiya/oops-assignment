import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int max = Math.max(num1, num2);
        int lcm = max;
        
        while (lcm % num1 != 0 || lcm % num2 != 0) {
            lcm += max;
        }
        
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        scanner.close();
    }
}
