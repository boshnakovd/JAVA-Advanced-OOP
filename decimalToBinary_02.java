package stacksAndQueques;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class decimalToBinary_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = parseInt(scanner.nextLine());
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        while (n != 0){
            int leftover = n % 2;
            deque.push(leftover);
            n = n / 2;
        }
        for (Integer integer : deque) {
            System.out.print(integer);
        }
    }
}
