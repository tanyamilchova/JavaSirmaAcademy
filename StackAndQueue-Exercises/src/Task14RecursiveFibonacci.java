public class Task14RecursiveFibonacci {
    //Each member of the Fibonacci sequence is calculated from the sum of the two
    //previous members. The first two elements are 0, 1. Therefore, the sequence goes like
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34…
    //The following sequence can be generated with an array, but that&#39;s easy, so your task is
    //to implement it recursively.
    //If the function getFibonacci(n) returns the n th Fibonacci number, we can express it using
    //getFibonacci(n) = getFibonacci(n-1) + getFibonacci(n-2).
    //However, this will never end, and a Stack Overflow Exception is thrown in a few seconds.
    //For the recursion to stop, it has to have a &quot;bottom&quot;. The bottom of the recursion is
    //getFibonacci(1), and should return 1. The same goes for getFibonacci(0).
    // On the only line in the input, the user should enter the wanted Fibonacci number N
    //where 1 ≤ N ≤ 49.
    // The output should be the n th Fibonacci number counting from 0.
    //Input Output
    //5 5
    //8 35
    //2 1
    public static void main(String[] args) {

        int num=8;
        long result=getFiboNum(num);
        System.out.println(result);
    }
    public static long getFiboNum(int num){
        if(num<=1){
            return num;
        }

        long sum=getFiboNum(num-1)+getFiboNum(num-2);
        return sum;
    }
}
