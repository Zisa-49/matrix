
package matrix;
import java.util.Scanner;

public class Multiplication {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r1, c1, r2, c2;
        System.out.print("Enter the number of rows and columns for A matrix: ");
        r1 = scanner.nextInt();
        c1 = scanner.nextInt();

        System.out.print("Enter the number of rows and columns for B matrix: ");
        r2 = scanner.nextInt();
        c2 = scanner.nextInt();

        while (c1 != r2) {
            System.out.println("Error! Column of A matrix not equal to row of B matrix.");
            System.out.print("Enter the number of rows and columns for A matrix: ");
            r1 = scanner.nextInt();
            c1 = scanner.nextInt();

            System.out.print("Enter the number of rows and columns for B matrix: ");
            r2 = scanner.nextInt();
            c2 = scanner.nextInt();
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        System.out.println("Enter the elements for A matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("A[" + i + "][" + j + "]=");
                A[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter the elements for B matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("B[" + i + "][" + j + "]=");
                B[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("A=");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("B=");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                for (int k = 0; k < c1; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        System.out.println("\nA*B=");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

