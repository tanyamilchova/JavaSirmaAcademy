import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task10MaximumElement {
    //You have an empty sequence, and you will be given N commands. Each command is one
    //of the following types:
    // &quot;1 X&quot; - Push the element X into the stack.
    // &quot;2&quot; - Delete the element present at the top of the stack.
    // &quot;3&quot; - Print the maximum element in the stack.
    // The first line of input contains an integer N, where 1 ≤ N ≤ 10 5 .
    // The next N lines contain commands.
    // The element X will be in the range 1 ≤ X ≤ 10 9 .
    // The type of the command will be in the range 1 ≤ Type ≤ 3.
    // For each command of type &quot;3&quot;, print the maximum element in the stack on a
    //new line.

    //Input Output
    //9
    //1 97
    //2
    //1 20
    //2
    //1 26
    //1 20
    //3
    //1 91
    //3
    public static void main(String[] args) {
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        Scanner sc=new Scanner(System.in);
        int numQuieries=Integer.parseInt(sc.nextLine());

        String[] arrInput=new String[numQuieries];
        for (int i = 0; i < numQuieries; i++) {
       String query=sc.nextLine();
       arrInput[i]=query;
        }

        for (int i = 0; i < arrInput.length; i++) {
            if(arrInput[i].charAt(0)=='1'){
                int elem=pushIntoStack(arrInput[i]);
               deque.push(elem);
            }else {
                if(arrInput[i].charAt(0)=='2'){
                    if(!deque.isEmpty()){
                        deque.pop();
                    }
                }
                else {
                    if(arrInput[i].charAt(0)=='3'){
                        int max;
                        if(!deque.isEmpty()){
                             max=deque.pop();
                            for (int j = 0; j < deque.size(); j++) {

                                    int current=deque.pop();
                                    if(max<current){
                                        max=current;
                                    }
                            }
                            System.out.println(max);
                        }
                    }
                }
            }
        }
    }

    private static int pushIntoStack(String s) {
        if(s!=null && !s.equals(" ")) {
            String[] arr = s.split(" ");
            String element = arr[1];
            int elemInt=Integer.parseInt(element);
            if(elemInt>0 && elemInt<1000000000) {
//                System.out.println(element);
                return elemInt;
            }
        }
        return 0;
    }
}
