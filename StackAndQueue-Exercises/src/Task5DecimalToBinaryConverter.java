import java.util.ArrayDeque;

public class Task5DecimalToBinaryConverter {
    //Create a simple program that can convert a decimal number to its binary
    //representation. Implement an elegant solution using a Stack.
    //Print the binary representation back at the terminal.
    // If the given number is 0, just print 0.
    // Else, while the number is greater than zero, divide it by 2 and push the
    //reminder into the stack.
    //while(decimal != 0){
    //stack.push(decimal % 2);
    //decimal /= 2;
    //}
    // When you are done dividing, pop all reminders from the stack, which is the
    //binary representation.
    //Input
    //Output
    //
    //10 1010
    //1024 10000000000

    public static void main(String[] args) {
        ArrayDeque<Integer>deque=new ArrayDeque<>();
        int num=1024;
        while (num>0){
            deque.push(num%2);
            num/=2;
        }
        while (! deque.isEmpty()){
            System.out.print(deque.pop()+" ");
        }
    }
}
