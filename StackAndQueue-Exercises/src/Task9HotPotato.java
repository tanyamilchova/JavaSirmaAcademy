import java.util.ArrayDeque;
import java.util.Arrays;

public class Task9HotPotato {
    //Hot potato is a game in which children form a circle and start passing a hot potato. The
    //counting starts with the first kid. Every n th toss, the child left with the potato leaves the
    //game. When a kid leaves the game, it passes the potato forward. This continues
    //repeating until there is only one kid left.
    //Create a program that simulates the game Hot Potato. Print every kid that is removed
    //from the circle. In the end, print the kid that is left last.

    public static void main(String[] args) {
        String children = "George Peter Ivan John Harry";
        int countNum = 10;
        String[] arrChildren = children.split(" ");

        ArrayDeque<String> deque = new ArrayDeque<>(Arrays.asList(arrChildren));

        while (deque.size() > 1) {
            for (int i = 1; i < countNum; i++) {
                deque.addLast(deque.removeFirst());
            }
            System.out.println("Remove " + deque.removeFirst());
        }
        System.out.println("Last is " + deque.peek());
    }
}

