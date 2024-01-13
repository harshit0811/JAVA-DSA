import java.util.Scanner; 
public class RectanglePerimeter { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
// Prompt the user to enter the length of the rectangle 
System.out.print("Enter the length of the rectangle: "); 
double length = scanner.nextDouble(); 
// Prompt the user to enter the width of the rectangle 
System.out.print("Enter the width of the rectangle: "); 
double width = scanner.nextDouble(); 
// Calculate the perimeter of the rectangle 
double perimeter = 2 * (length + width); 
// Print the result 
System.out.printf("The perimeter of the rectangle is: %.2f%n", 
perimeter); 
// Close the scanner 
scanner.close(); 
} 
} 