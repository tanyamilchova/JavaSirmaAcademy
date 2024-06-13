import java.util.ArrayDeque;
import java.util.Scanner;

public class LegendaryDuels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strikes = sc.nextLine();
        boolean isBalanced=true;
        ArrayDeque<Character> stringsDeque=new ArrayDeque<>();
        boolean hasExclMark=false;
        for (int i = 0; i < strikes.length(); i++) {
            if (strikes.charAt(i) == '!') {
                if (!hasExclMark) {
                    stringsDeque.push(strikes.charAt(i));
                    hasExclMark = true;
                } else {
                    if (stringsDeque.isEmpty() || stringsDeque.pop() != '!') {
                        isBalanced = false;
                        break;
                    }
                    hasExclMark = false;
                }
            } else if (strikes.charAt(i) == '(' || strikes.charAt(i) == '{') {
                stringsDeque.push(strikes.charAt(i));
            } else if (strikes.charAt(i) == ')' || strikes.charAt(i) == '}') {
                if (stringsDeque.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char lastChar = stringsDeque.pop();
                if (!((strikes.charAt(i) == ')' && lastChar == '(') || (strikes.charAt(i) == '}' && lastChar == '{'))) {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (!stringsDeque.isEmpty()) {
            isBalanced = false;
        }
        if(isBalanced){
            System.out.println("Legendary");
        }else {
            System.out.println("Not Legendary");
        }
    }
}
//  ((!!)(({!!})))