package matrices;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class sumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(", ");
        int rows = parseInt(input[0]);
        int cols = parseInt(input[1]);
        int [] [] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] rowOfMatrix = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = parseInt(rowOfMatrix[j]);
            }
        }
        int sum = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                sum = sum + matrix[row][col];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
