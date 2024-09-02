
package matrix;
import java.util.Scanner;
public class Addition { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] C = new int[rows][cols];

        System.out.println("Enter the elements for A matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("A[" + rows + "][" + cols + "] = ");
                A[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter the elements for B matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("B[" + rows + "][" + cols + "] = ");
                B[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("A = ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("B = ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("\nA + B = ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    

