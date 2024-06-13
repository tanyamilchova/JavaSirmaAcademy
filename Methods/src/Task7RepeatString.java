public class Task7RepeatString {
    //Write a method that receives a string and a repeat count n (integer). The method should
    //return a new string (the old one repeated n times).
    //Input Output
    //abc
    //3
    //
    //abcabcabc
    //
    //String
    //2
    public static void main(String[] args) {
        String str="String";
        int repetition=2;
        repeatString(str,repetition);
    }

    private static void repeatString(String str, int repetition) {
        for (int i = 0; i < repetition; i++) {
            System.out.print(str);
        }

    }
}
