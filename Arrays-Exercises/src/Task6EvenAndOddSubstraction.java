public class Task6EvenAndOddSubstraction {
    //  Write a program that calculates the difference between the sum of the even and the sum
    //of the odd numbers in an array.
    public static void main(String[] args) {
        int evenSum=0;
        int oddSum=0;
        int[]arr={1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                evenSum+=arr[i];
            }else {
                oddSum+=arr[i];
            }
        }
        System.out.println(evenSum-oddSum);
    }
}
