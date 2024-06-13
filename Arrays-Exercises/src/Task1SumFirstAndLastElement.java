public class Task1SumFirstAndLastElement {

    //Write a function that receives an array of strings and prints the sum of the first and last
    //element in that array.
    public static void main(String[] args) {
        int[] arr = {11,58,69};
        if(arr.length>0) {
            int sum = arr[0] + arr[arr.length - 1];
            System.out.println(sum);
        }
    }
}
