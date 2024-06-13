public class Task20LongestSequence {
    //Write a program that finds the longest sequence of identical elements in an array of integers. If 2 or
    //more sequences have the same length, print the one that is on the &quot;right&quot;.
    //
    //Input Output
    //2 2 2 3 4 4 2 2 2 1 2 2 2
    //1 1 1 2 3 1 3 3 1 1 1 1 1
    //1 1 2 3 4 5 6 2 2 1 1
    //4 4 4 4 4 4 4 4
    //0 1 1 2 2 3 3 4 4 5 5 1 1
    public static void main(String[] args) {
        int[]arr={2,2,2,3,4,4,5,5,5,1};
        int maxCoount=0;
        int tempCount=1;
        int endPrint=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                tempCount++;
            }else {
                if(maxCoount<=tempCount){
                    maxCoount=tempCount;
                    endPrint=i;
                }
                tempCount=1;
            }
        }
        for (int i = endPrint-maxCoount+1; i <= endPrint; i++) {
            System.out.print(arr[i]);
        }
    }
}
