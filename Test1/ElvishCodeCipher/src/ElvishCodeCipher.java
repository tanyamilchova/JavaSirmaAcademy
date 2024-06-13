import java.util.Scanner;

public class ElvishCodeCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int numToSubtract=Integer.parseInt(sc.nextLine());
        String encripted=decipherText(input,numToSubtract);
        System.out.println(encripted);
    }

    private static String decipherText(String input, int numToSubtract) {
        if(!input.isEmpty() && input.length()<=100 && numToSubtract>=1 && numToSubtract<=25) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                int subtractedChar = input.charAt(i) - numToSubtract;
                result.append((char) subtractedChar);
            }
            return result.toString();
        }
        return null;
    }
}
