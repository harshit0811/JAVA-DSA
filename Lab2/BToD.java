import java.util.Scanner;

public class BToD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an 8-bit unsigned binary integer (0s and 1s):");

        String binaryString = scanner.nextLine();

        if (binaryString.matches("[01]{8}")) {

            int decimalValue = Integer.parseInt(binaryString, 2);

            System.out.println("Decimal value: " + decimalValue);

        } else {

            System.out.println("Invalid input. Please enter a valid 8-bit binary integer.");

        }

    }

}

