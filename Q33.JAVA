public class Commission {
    private double sales;    
    public Commission(double sales) {
        this.sales = sales;
    }

    public double commission() {
        return sales * 0.10;  
    }
}

import java.util.Scanner;

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        double sales = scanner.nextDouble();

        
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
           
            Commission commissionObject = new Commission(sales);
            double commission = commissionObject.commission();
            System.out.println("The commission is: " + commission);
        }

        scanner.close();
    }
}
