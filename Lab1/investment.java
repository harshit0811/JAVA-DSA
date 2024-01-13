import java.util.Scanner; 
 
public class investment { 
    public static void main(String[] args) { 
        // Create a Scanner object to read input 
        Scanner scanner = new Scanner(System.in); 
 
        // Prompt the user to enter the initial amount (Principal amount) 
        System.out.print("Enter the initial amount (Principal amount): "); 
        double principalAmount = scanner.nextDouble(); 
 
        // Prompt the user to enter the interest rate 
        System.out.print("Enter the interest rate (in percentage): "); 
        double interestRate = scanner.nextDouble(); 
 
        // Convert interest rate to decimal 
        interestRate /= 100; 
 
        // Display headers for the output 
        System.out.println("\nYear\tBalance"); 
 
        // Calculate and display balance for each year (up to five years) 
        for (int year = 1; year <= 5; year++) { 
            // Calculate balance with cumulative interest 
            double balance = principalAmount * Math.pow(1 + interestRate, year); 
 
            // Display the result 
            System.out.printf("%d\t%.2f%n", year, balance); 
        } 
 
        // Close the scanner 
        scanner.close(); 
    } 
} 