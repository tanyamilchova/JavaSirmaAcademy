public class Task16ProcessOddNums {
    //You are given an array of numbers. Write a program that prints the elements at odd
    //positions from the array, doubled and in reverse order.
    //The input comes as an array of number elements.
    //Input           Output  Input               Output
    //10, 15, 20, 25  50 30    3, 0, 10, 4, 7, 3  6 8 0
    public static void main(String[] args) {
        int[] arr={3, 0, 10, 4, 7, 3};
        for (int i = arr.length-1; i>=0; i--) {
            if((i+1)%2==0){
                System.out.print(arr[i]*2+" ");
            }
        }
    }
}
