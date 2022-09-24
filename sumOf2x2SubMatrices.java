package matrices;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class sumOf2x2SubMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(", ");
        int rows = parseInt(input[0]);
        int cols = parseInt(input[1]);
        int [] [] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        }
        int [] [] maxMatrix = new int[2][2];
        int maxSum = Integer.MIN_VALUE;
        for (int r = 0; r < matrix.length - 1; r++) {
            for (int c = 0; c < matrix[r].length - 1; c++) {
                int sum = matrix[r][c] + matrix[r][c + 1]
                        + matrix[r + 1][c] + matrix[r + 1][c + 1];
                if(sum > maxSum){
                    maxSum = sum;
                    maxMatrix[0][0] = matrix[r][c];
                    maxMatrix[0][1] = matrix[r][c + 1];
                    maxMatrix[1][0] = matrix[r + 1][c];
                    maxMatrix[1][1] = matrix [r + 1] [c + 1];
                }
            }
        }
        for (int [] arr:
             maxMatrix) {
            for (int el:
                 arr) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
}
