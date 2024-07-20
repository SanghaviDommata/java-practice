import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define the dimensions of the matrix
        int rows = 3;
        int columns = 4;
        
        // Initialize the matrix
        int[][] matrix = new int[rows][columns];
        
        // Input the matrix elements from the user
        System.out.println("Enter the elements of the 3x4 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Print the original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Initialize the transpose matrix
        int[][] transpose = new int[columns][rows];
        
        // Compute the transpose of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        // Print the transposed matrix
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        
        // Close the scanner
        scanner.close();
    }
}