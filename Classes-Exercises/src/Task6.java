import java.util.Random;

public class Task6 {
    //You are given a list of words in one line. Randomize their order and print each word on a
    //separate line.
    public static void main(String[] args) {
        String input="Java is one of the programming languages";
        String []arrInp=input.split(" ");
        Random random=new Random();
        for (int i = 1; i <= arrInp.length; i++) {
            int rand=random.nextInt(arrInp.length);
            System.out.println(arrInp[rand]);
        }

    }
}
