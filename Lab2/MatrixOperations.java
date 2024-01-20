import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 Reading a two-dimensional array
        System.out.println("Enter the number of rows and columns of the matrix:");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = readMatrix(rows, columns);

        System.out.println("Entered Matrix:");
        printMatrix(matrix);

        //2 Finding maximum element in the matrix
        int maxElement = findMaxElement(matrix);
        System.out.println("Maximum Element in the Matrix: " + maxElement);

        // Finding standard deviation of elements in the matrix
        double stdDeviation = findStandardDeviation(matrix);
        System.out.println("Standard Deviation of Elements: " + stdDeviation);

        //3 Printing the transpose of the matrix
        int[][] transpose = findTranspose(matrix);
        System.out.println("Transpose of the Matrix:");
        printMatrix(transpose);

        scanner.close();
    }

    private static int[][] readMatrix(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    private static int findMaxElement(int[][] matrix) {
        int maxElement = matrix[0][0];
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > maxElement) {
                    maxElement = element;
                }
            }
        }
        return maxElement;
    }
    private static double findStandardDeviation(int[][] matrix) {
        double mean = 0;
        int count = 0;

        // Calculate mean
        for (int[] row : matrix) {
            for (int element : row) {
                mean += element;
                count++;
            }
        }
        mean /= count;

        double sumSquaredDifferences = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sumSquaredDifferences += Math.pow(element - mean, 2);
            }
        }

        return Math.sqrt(sumSquaredDifferences / count);
    }

    private static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}