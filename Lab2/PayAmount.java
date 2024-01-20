import java.util.Scanner; 

public class PayAmount { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        int[] purse = new int[7]; 

        System.out.println("Enter the number of notes for each denomination:"); 

        for (int i = 0; i < 7; i++) { 

          purse[i] = scanner.nextInt(); 

        } 

        System.out.println("Enter the amount to be paid (less than Rs. 1000):"); 

        int amountToPay = scanner.nextInt(); 

        payAmount(purse, amountToPay); 

    } 

    public static void payAmount(int[] purse, int amount) { 

        int[] denominations = {100, 50, 20, 10, 5, 2, 1}; 

        int[] notesUsed = new int[7]; 

        for (int i = 0; i < 7; i++) { 

            notesUsed[i] = Math.min(amount / denominations[i], purse[i]); 

            amount -= notesUsed[i] * denominations[i]; 

        } 

        if (amount == 0) { 

            System.out.println("Number of notes to be used:"); 

            for (int i = 0; i < 7; i++) { 

                System.out.println("Rs. " + denominations[i] + ": " + notesUsed[i]); 

            } 

        } else { 

            System.out.println("Payment Decline"); 

        } 

    } 

} 