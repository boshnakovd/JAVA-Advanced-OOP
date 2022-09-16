package stacksAndQueques;

import java.util.ArrayDeque;
import java.util.Scanner;

public class browserHistoryAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> removedHistory = new ArrayDeque<>();
        String input = scanner.nextLine();
        String currentURL = "";
        while (!input.equals("Home")){
            if(input.equals("back")){
                if(browserHistory.size() > 1){
                    String removed = browserHistory.pop();
                    removedHistory.push(removed);
                    currentURL = browserHistory.peek();
                    System.out.println(currentURL);
                } else {
                    System.out.println("no previous URLs");
                }
            }else if (input.equals("forward")){
                if(removedHistory.size() >= 1){
                    String moved = removedHistory.pop();
                    browserHistory.push(moved);
                    System.out.println(moved);
                } else {
                    System.out.println("no next URLs");
                }
            }else {
                browserHistory.push(input);
                currentURL = browserHistory.peek();
                System.out.println(currentURL);
            }
            input = scanner.nextLine();
        }
    }
}
