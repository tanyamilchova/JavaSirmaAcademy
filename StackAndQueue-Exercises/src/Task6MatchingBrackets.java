import java.lang.ref.SoftReference;
import java.util.ArrayDeque;

public class Task6MatchingBrackets {
    //We are given an arithmetical expression with brackets. Scan through the string
    //and extract each sub-expression.
    //Print the result back at the terminal.
    // Scan through the expression searching for brackets:
    //o If you find an opening bracket, push the index into the stack.
    //o If you find a closing bracket, pop the topmost element from the
    //stack. This is the index of the opening bracket.
    //o Use the current and the popped index to extract the sub-expression.
    //
    //Input Output
    //1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5 (2 + 3)
    //(3 + 1)
    //(2 - (2 + 3) * 4 / (3 + 1))
    //
    //(2 + 3) - (2 + 3) (2 + 3)
    //(2 + 3)
    public static void main(String[] args) {
        ArrayDeque<Integer>deque=new ArrayDeque<>();
        String inputStr="1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5";
        int start=0;
        for (int i = 0; i <inputStr.length() ; i++) {
            if(inputStr.charAt(i)=='('){
                deque.push(i);
                System.out.println(deque);
            }else {
                if(inputStr.charAt(i)==')'){
                    start=deque.pop();
                    System.out.println(deque);
                    String subStr=inputStr.substring(start,i+1);
                    System.out.println(subStr);
                }
            }
        }
    }
}
