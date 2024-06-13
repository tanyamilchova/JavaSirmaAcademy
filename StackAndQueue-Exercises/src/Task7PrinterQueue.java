import java.util.ArrayDeque;

public class Task7PrinterQueue {
    //The printer queue is a simple way to control the order of files sent to a printer device. We
    //know that a single printer can be shared between multiple devices. Тo preserve the order
    //of the files sent, we can use a queue.
    //Write a program which takes filenames until &quot;print&quot; command is received. Then as output,
    //print the filenames in the order of printing. Some of the tasks may be canceled. If you
    //receive &quot;cancel&quot; you have to remove the first file to be printed. If there is no file in the
    //queue, print &quot;Standby&quot;.
    // Use offer(), when adding the file.
    // Use pollFirst(), when printing the file.
    //Input Output
    //Exercises.docx
    //cancel
    //cancel
    //Presentation.pptx
    //Note.txt
    //MyClass.java
    //cancel
    //print
    public static void main(String[] args) {
        String input = "Exercises.docx\n" +
                "cancel\n" +
                "cancel\n" +
                "Presentation.pptx\n" +
                "Note.txt\n" +
                "MyClass.java\n" +
                "cancel\n" +
                "print";
        String[] arrInput = input.split("\n");
        ArrayDeque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i].equals("print")) {
                while (!deque.isEmpty()) {
                    String printed = deque.pop();
                    System.out.println(printed);
                }
            } else {
                if (arrInput[i].equals("cancel")) {
                    if (!deque.isEmpty()) {
                        String removed = deque.pop();
                        System.out.println("Canceled " + removed);
                    } else {
                        System.out.println("Standby");
                    }
                } else {
                    deque.offer(arrInput[i]);
                }
            }
        }
    }
}
