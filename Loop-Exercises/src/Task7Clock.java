public class Task7Clock {
    //Write a function that prints the hours of the day from 0:0 to 23:59, each on a separate
    //line. Hours must be written in the format &#39;{hour}:{minutes}&#39;.
    public static void main(String[] args) {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.println(i+":"+j);
            }
        }
    }

}
