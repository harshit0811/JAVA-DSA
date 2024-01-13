import java.util.Scanner; 
public class StudentResultCalculator { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
// Prompt the user to enter marks for each subject 
System.out.println("Enter marks for each subject:"); 
// Initialize variables for marks in each subject 
        double subject1, subject2, subject3, subject4, subject5; 
 
        // Read marks for each subject 
        System.out.print("Subject 1: "); 
        subject1 = scanner.nextDouble(); 
 
        System.out.print("Subject 2: "); 
        subject2 = scanner.nextDouble(); 
 
        System.out.print("Subject 3: "); 
        subject3 = scanner.nextDouble(); 
 
        System.out.print("Subject 4: "); 
        subject4 = scanner.nextDouble(); 
 
        System.out.print("Subject 5: "); 
        subject5 = scanner.nextDouble(); 
 
        // Calculate total, average, and percentage 
        double total = subject1 + subject2 + subject3 + subject4 + subject5; 
        double average = total / 5; 
        double percentage = (total / 500) * 100; 
 
        // Print the results 
        System.out.printf("Total marks: %.2f%n", total); 
        System.out.printf("Average marks: %.2f%n", average); 
        System.out.printf("Percentage: %.2f%%%n", percentage); 
 
        // Close the scanner 
        scanner.close(); 
    } 
} 