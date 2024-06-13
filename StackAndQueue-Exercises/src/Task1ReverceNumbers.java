import java.util.ArrayDeque;
import java.util.Scanner;

public class Task1ReverceNumbers {
//Write a program that reads N integers from the console and reverses them using a
//stack. Use the ArrayDeque&lt;Integer&gt; class. Just put the input numbers in the stack
//and pop them.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer>deque=new ArrayDeque<>();
        for (int i = 0; i < nums; i++) {
            int num=Integer.parseInt(sc.nextLine());
            deque.add(num);
        }
        System.out.println(deque);
        int nextElem= 0;
        for (int i = 0; i < nums; i++) {
            nextElem=deque.removeLast();
            System.out.print(nextElem+" ");
        }
    }
}
