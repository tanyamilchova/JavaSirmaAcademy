import java.util.ArrayDeque;

public class Task2BasikStackOperation {
    //You will be given an integer N representing the number of elements to push into the
//stack, an integer S representing the number of elements to pop from the stack, and
//an integer X, an element that you should check whether is present in the stack. If it
//is present, print &quot;true&quot; on the console. If it&#39;s not, print the smallest element currently
//present in the stack.
// On the first line, you will be given N, S, and X separated by a single space.
//
//e: office@sirma.bg a: 135 Tsarigradsko Shosse, blvd.
//m: +359 2 9768310 1784 Sofia, Bulgaria
//
//sirma.com
// On the next line, you will be given a line of numbers separated by one or more
//white spaces.
// On a single line print, either &quot;true&quot; if X is present in the stack, otherwise, print
//the smallest element in the stack.
    public static void main(String[] args) {
        String firstRow = "5 2 13";
        String secondRow = "1 10 45 32 4";
        String[] firstArr = firstRow.split(" ");
        int numsToPush = Integer.parseInt(firstArr[0].trim());
        int numsToPop = Integer.parseInt(firstArr[1].trim());
        int wantedNum = Integer.parseInt(firstArr[2].trim());
        String[] secondArr = secondRow.split(" ");
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < numsToPush; i++) {
            deque.push(Integer.parseInt(secondArr[i]));
        }
        System.out.println(deque);
        for (int i = 0; i < numsToPop; i++) {
            int elem = deque.pop();
            System.out.println(elem);
        }
        if (deque.contains(wantedNum)) {
            System.out.println("true");
        } else {
            if (!deque.isEmpty()) {
                int min = deque.pop();
                for (int i = 0; i <= deque.size(); i++) {
                    int element = deque.pop();
                    if (min > element) {
                        min = element;
                    }
                    System.out.println(deque);
                }
                System.out.println(min);
            } else {
                System.out.println("0");
            }

        }
    }
}
