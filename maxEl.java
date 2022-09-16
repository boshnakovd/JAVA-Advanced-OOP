package stacksAndQueques;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.parseInt;

public class maxEl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = parseInt(scanner.nextLine());
        Deque<Integer> stack  = new ArrayDeque<>();
        for (int i = 0; i < countCommands; i++) {
            String[] commands = scanner.nextLine().split(" ");
            switch (commands[0]){
                case"1":
                    int currentNum = parseInt(commands[1]);
                    stack.push(currentNum);
                    break;
                case"2":
                    stack.pop();
                    break;
                case"3":
                    int maxEl = Collections.max(stack);
                    System.out.printf("%d%n", maxEl);
                    break;
            }
        }
    }
}
