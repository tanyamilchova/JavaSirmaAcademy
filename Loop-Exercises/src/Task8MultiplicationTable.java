public class Task8MultiplicationTable {
    //Print the multiplication table for numbers 1 through 10 in the following format:
    //&quot;{first multiplier} * {second multiplier} = {result}&quot;.
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println((i+1)+"*"+(j+1));
            }
        }
    }
}
