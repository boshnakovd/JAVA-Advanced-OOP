package stacksAndQueques;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class basicQueueOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        int countNumsToOffer = parseInt(input[0]);
        int countNumsToPoll = parseInt(input[1]);
        int currentNum = parseInt(input[2]);
        Deque<Integer> queue = new ArrayDeque<>();
        String [] numsToAdd = scanner.nextLine().split(" ");
        for (int i = 0; i < countNumsToOffer; i++) {
            queue.offer(parseInt(numsToAdd[i]));
        }
        for (int i = 0; i < countNumsToPoll; i++) {
            queue.poll();
        }
        if(queue.isEmpty()){
            System.out.println("0");
        } else if(queue.contains(currentNum)){
            System.out.println(true);
        } else {
            int minElement = Collections.min(queue);
            System.out.println(minElement);
        }
    }
}

