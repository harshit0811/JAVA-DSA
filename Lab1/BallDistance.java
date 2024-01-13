import java.util.Scanner; 
 
public class BallDistance { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        // Prompt the user to enter the height (Y) in meters 
        System.out.print("Enter the height (Y) in meters: "); 
        double height = scanner.nextDouble(); 
 
        // Acceleration due to gravity (m/s^2) 
        double g = 9.8; 
 
        // Calculate the total distance traversed by the ball when it touches the ground for the third time 
        double totalDistance = calculateTotalDistance(height, g); 
 
        // Print the result 
        System.out.printf("The total distance traversed by the ball is: %.2f meters%n", totalDistance); 
 
        // Close the scanner 
        scanner.close(); 
    } 
 
    // Function to calculate the total distance traversed by the ball 
    private static double calculateTotalDistance(double initialHeight, double 
gravity) { 
        double totalDistance = 0; 
        double currentHeight = initialHeight; 
 
        // Calculate distance for each bounce (three bounces) 
        for (int i = 0; i < 3; i++) { 
            // Calculate distance for the current bounce 
            double bounceDistance = calculateBounceDistance(currentHeight, 
gravity); 
 
            // Add the distance of the current bounce to the total distance 
            totalDistance += bounceDistance; 
 
            // Update the current height for the next bounce 
            currentHeight = bounceDistance / 2; 
        } 
return totalDistance; 
} 
// Function to calculate the distance of a single bounce 
private static double calculateBounceDistance(double height, double gravity) 
{ 
// Using the kinematic equation: distance = (initial velocity^2) / (2 * acceleration) 
double initialVelocity = Math.sqrt(2 * gravity * height); 
double bounceDistance = (initialVelocity * initialVelocity) / (2 * 
gravity); 
return bounceDistance; 
} 
} 
