import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);

        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }

    // Function to reverse a given number
    private static int reverseNumber(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}
