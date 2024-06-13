public class Task12ExtractNonDecrSubsequence {
    //Extracts only those numbers that form a non-decreasing subsequence. Start from the
    //first element and continue to the end of the given array of numbers. Any number which
    //is LESS THAN the current biggest one is ignored, alternatively if it’s equal or higher than
    //the current biggest one you set it as the current biggest one and you continue to the next
    //number.
    //The input comes as an array of numbers.
    //The output is the processed array after the filtration, which should be a non-decreasing
    //subsequence. The elements should be printed on one line, separated by a single space.
    //Examples
    //Input Output
    //1, 3, 8, 4, 10, 12, 3, 2, 24 1 3 8 10 12 24
    //1, 2, 3, 4 1 2 3 4
    //20, 3, 2, 15, 6, 1 20
    public static void main(String[] args) {
        int[]arr={20,3,5};
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]>=max){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
