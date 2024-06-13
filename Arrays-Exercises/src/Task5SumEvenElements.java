import java.util.Arrays;

public class Task5SumEvenElements {
    // Receive an array of Strings parce them to numbers and sum only even elements
    public static void main(String[] args) {
//        String[] arr = {};
        String[] arr = {"5", "6", "12", "3", "8"};
        int sum=0;
        int[]arrInteger=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int element=Integer.parseInt(arr[i]);
            arrInteger[i]=element;
        }
        for (int i = 0; i < arrInteger.length; i++) {
            if(arrInteger[i]%2==0){
              sum+=arrInteger[i];
            }
        }
        System.out.println(sum);
    }
}
