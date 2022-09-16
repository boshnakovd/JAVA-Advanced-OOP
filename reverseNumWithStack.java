package stacksAndQueques;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class reverseNumWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Deque<String> stack = new ArrayDeque<>();
        for (String num:
             input) {
            stack.push(num);
        }
        while (!stack.isEmpty()){
            System.out.printf("%s ", stack.pop());
        }
    }
}
