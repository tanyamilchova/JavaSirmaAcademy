import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        String input="123 456 789";
        int[]arr= Arrays.stream(input.split(" "))
                .mapToInt(e->Integer.parseInt(e)*10)
                .toArray();
        System.out.println(Arrays.toString(arr));
        //42
    }
}
