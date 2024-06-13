import priorityQueue.Task;

import java.util.*;

public class Task13DocumentEditor {
    //Use two stacks to facilitate Undo and Redo.
    //Input Output
//    Insert(&quot;Hello&quot;)
//    Insert(&quot; World&quot;)
//    Undo()
//    Redo()
//    End
    //
    //Hello
    //Hello World
    //Hello
    //Hello World
    public static void main(String[] args) {


        String input = "Insert(\"Hello\")\nInsert(\" World\")\nUndo()\nRedo()\nEnd";
        ArrayDeque<String> arrayDeque=new ArrayDeque<>();
        ArrayDeque<String>backArrayDeque=new ArrayDeque<>();

        String[] arr = input.split("\n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("End")) {
                break;
            } else {

                if (arr[i].contains("Insert")) {
                    String res = Arrays.toString(arr[i].split("Insert"));
                    String sub = res.substring(res.indexOf('"') + 1, res.lastIndexOf('"'));
                    arrayDeque.push(sub);
                    System.out.println(arrayDeque);
                } else {
                    if (arr[i].contains("Undo")) {
                        backArrayDeque.push(arrayDeque.pop());
                        System.out.println(arrayDeque);
                    } else {
                        if (arr[i].contains("Redo")) {
                            arrayDeque.push(backArrayDeque.pop());
                            System.out.println(arrayDeque);
                        }
                    }
                }
            }
        }
    }
}
