package stacksAndQueques;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if(n == 0){
            stack.push(0);
        } else {
            while (n > 0){
                stack.push(n % 2);
                n = n / 2;
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
