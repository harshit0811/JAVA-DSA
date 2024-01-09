import java.util.Scanner;

public class primeNO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + ":");
        generatePrimes(lowerLimit, upperLimit);

        scanner.close();
    }

    private static void generatePrimes(int lowerLimit, int upperLimit) {
        for (int num = lowerLimit; num <= upperLimit; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
