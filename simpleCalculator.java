package stacksAndQueques;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = scanner.nextLine().split(" ");
        ArrayDeque<String> deque = new ArrayDeque<>();
        Collections.addAll(deque, array);

        while (deque.size()>1){
            int firstNum = parseInt(deque.pop());
            String operator = deque.pop();
            int secondNum = parseInt(deque.pop());
            int result = 0;
            if(operator.equals("+")){
                result = firstNum + secondNum;
            } else {
                result = firstNum - secondNum;
            }
            deque.push(String.valueOf(result));
        }
        System.out.println(deque.peek());
    }
}
