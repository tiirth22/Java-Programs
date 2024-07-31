import java.util.Scanner;

public class ArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the numerator (x): ");
            int x = scanner.nextInt();
            
            System.out.print("Enter the denominator (y): ");
            int y = scanner.nextInt();
            
            int result = x / y;
            System.out.println("Result: " + result);
            
        } catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
    }
}
