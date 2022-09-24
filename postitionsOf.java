package matrices;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class postitionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = parseInt(input[0]);
        int columns = parseInt(input[1]);
        int [][]matrix = new int [rows][columns];
        for (int row = 0; row < rows; row++) {
            String [] rowData = scanner.nextLine().split(" ");
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = parseInt(rowData[col]);
            }
        }
        int number = parseInt(scanner.nextLine());
        boolean found = false;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if(matrix[row][col] == number){
                    System.out.println(row + " " + col);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("not found");
        }
    }
}
