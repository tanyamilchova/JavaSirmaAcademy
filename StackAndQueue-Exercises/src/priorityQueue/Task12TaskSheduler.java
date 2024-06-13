package priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task12TaskSheduler {
    //Create a PriorityQueue to manage tasks. Each task has a name and a priority. Implement
    //the getNextTask function to get the next task with the highest priority.
    public static void main(String[] args) {
        String input="Add Clean 1\n" +
                "Add Work 2\n" +
                "getNextTask\n" +
                "Add Exercise 3\n" +
                "Add Study 4\n" +
                "getNextTask";

        String []arr=input.split("\n");

        Comparator<Task>taskComparator=(t1,t2)->Integer.compare(t1.getPriority(),t2.getPriority());
        Queue<Task>queue=new PriorityQueue<>(taskComparator);

        for (int i = 0; i < arr.length; i++) {
            String []query=arr[i].split(" ");
            if(query[0].equals("Add")){
                String name=query[1].trim();
                int priority=Integer.parseInt(query[2].trim());
                Task task=new Task(priority,name);
                queue.add(task);
            }else {
                if(query[0].equals("getNextTask")){
                    queue.poll();
                    Task nextTask=queue.poll();
                    if(nextTask!=null) {
                        System.out.println( nextTask+"-"+nextTask.getPriority());
                    }
                }
            }
        }
    }
}

