package priorityQueue;
public class Task implements Comparable<Task> {
    private int priority;
    private String name;


    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(o.priority,this.priority);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
