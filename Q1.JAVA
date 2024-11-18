import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature in Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
        
        System.out.println("Enter temperature in Fahrenheit:");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
        
        scanner.close();
    }