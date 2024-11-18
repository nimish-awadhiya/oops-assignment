import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            freqMap.put(numbers[i], freqMap.getOrDefault(numbers[i], 0) + 1);
        }
        
        System.out.println("Duplicate elements and their frequencies:");
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > 1) {
                System.out.println(key + ": " + freqMap.get(key));
            }
        }
        
        scanner.close();
    }
}
