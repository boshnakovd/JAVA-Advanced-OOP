package matrices;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class inserctionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = parseInt(scanner.nextLine());
        int cols = parseInt(scanner.nextLine());
        char [] [] firstMatrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String [] rowData = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                firstMatrix[row][col] = rowData[col].charAt(0);
            }
        }
        char[][] secondMatrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String [] rowData = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                secondMatrix[row][col] = rowData[col].charAt(0);
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if(firstMatrix[row][col] == secondMatrix [row] [col]){
                    System.out.print(firstMatrix[row][col] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
