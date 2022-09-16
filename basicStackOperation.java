package stacksAndQueques;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class basicStackOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        int countNumsToAdd = parseInt(input[0]);
        int countNumsToRemove = parseInt(input[1]);
        int currentNum = parseInt(input[2]);
        Deque<Integer> stack = new ArrayDeque<>();
        String [] numsToAdd = scanner.nextLine().split(" ");
        for (int i = 0; i < countNumsToAdd; i++) {
            stack.push(parseInt(numsToAdd[i]));
        }
        for (int i = 0; i < countNumsToRemove; i++) {
            stack.pop();
        }
        if(stack.isEmpty()){
            System.out.println("0");
        } else if(stack.contains(currentNum)){
            System.out.println(true);
        } else {
            int minElement = Collections.min(stack);
            System.out.println(minElement);
        }
    }
}
