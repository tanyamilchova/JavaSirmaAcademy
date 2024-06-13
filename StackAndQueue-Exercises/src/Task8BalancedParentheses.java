import java.util.ArrayDeque;
import java.util.Arrays;

public class Task8BalancedParentheses {
    //Create a program that checks if a given string containing different types of brackets (e.g.
    //&#39;{}&#39;, &#39;[]&#39;, &#39;()&#39;) is balanced or not using Stack. The string is balanced if the brackets open
    //and close in the correct order.
    //Input Output
    //{[()]} True
    //{[(])} False
    //[{()()}] True
    //(((([])))) True
    //[{()()}{()()(}] False
    //[{()()}{()()()}] True
    public static void main(String[] args) {
        String inpStr = "{[()]},{[(])},[{()()}],(((([])))),[{()()}{()()(}],[{()()}{()()()}]";
        String[] arrStr = inpStr.split(",");
        System.out.println(Arrays.toString(arrStr));
        for (String inputStr : arrStr) {
            String input = inputStr.trim();

            ArrayDeque<Character> deque = new ArrayDeque<>();
            boolean balanced = true;
            for (int i = 0; i < input.length(); i++) {
                char curr = input.charAt(i);
                if (curr == '{' || curr == '[' || curr == '(') {
                    deque.push(curr);
                } else {
                    if (deque.isEmpty()) {
                        balanced = false;
                        break;
                    }
                    char toCompare = deque.pop();
                    if (input.charAt(i) == ')' || input.charAt(i) == '}' || input.charAt(i) == ']') {
                        if (!((curr == ')' && toCompare == '(') ||
                                (curr == '}' && toCompare == '{') ||
                                (curr == ']' && toCompare == '['))) {
                            balanced = false;
                            break;
                        }
                    }
                }
            }
            if (!deque.isEmpty()) {
                balanced = false;
            }
            System.out.println(balanced);

        }
    }
}
