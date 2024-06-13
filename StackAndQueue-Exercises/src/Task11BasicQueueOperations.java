import java.util.ArrayDeque;

public class Task11BasicQueueOperations {
    //You will be given an integer N representing the number of elements to enqueue (add), an
    //integer S representing the number of elements to dequeue (remove/poll) from the queue,
    //and finally, an integer X, an element that you should check whether is present in the
    //queue. If it is - prints true on the console, if it is not - print the smallest element currently
    //present in the queue.
    //Input Output
    //5 2 32
    //1 13 45 32 4
    //
    //true
    //
    //4 1 700
    //700 69 13 420
    //13
    //
    //3 3 90 0
    public static void main(String[] args) {
        ArrayDeque<Integer>deque=new ArrayDeque<>();
        boolean isPresent=false;
        String input="5 2 32\n" +
                "1 13 45 32 4";
        String []arr=input.split("\n");

            String rowOne=arr[0].trim();
            String []numbers=rowOne.split(" ");
            int numToAdd=Integer.parseInt(numbers[0].trim());
            int numToRemove=Integer.parseInt(numbers[1].trim());
            int numToCheck=Integer.parseInt(numbers[2].trim());

            String rowTwo=arr[1].trim();
            String[]elements=rowTwo.split(" ");
        for (int i = 0; i < numToAdd; i++) {
            int elem=Integer.parseInt(elements[i].trim());
            deque.push(elem);
        }
//        System.out.println(deque);
        for (int i = 0; i < numToRemove; i++) {
            deque.pollLast();
        }
//        System.out.println(deque);
        for (int i = 0; i < deque.size(); i++) {
            int elem=deque.pop();
            if(elem==numToCheck){
                isPresent=true;
                break;
            }
        }
        System.out.println(isPresent);
    }
}
