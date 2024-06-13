import java.util.Arrays;

public class Task10AddAndRemoveElements {
    //Write a program that adds and removes numbers to/from an array. You will receive a
    //command which can either be &quot;add&quot; or &quot;remove&quot;.
    //The initial number is 1. Each input command should increase that number, regardless of
    //what it is.
    //Upon receiving an &quot;add&quot; command you should add the current number to your array.
    //Upon receiving the &quot;remove&quot; command you should remove the last entered number,
    //currently existent in the array.
    //The input comes as array of strings. Each element holds a command.
    //Print elements in a row, separated by single space. In case of an empty array, just print
    //&quot;Empty&quot;.
    //Examples
    //Input Output
    //add,add,add,add 1 2 3 4
    //add,add,remove,add,add 1 3 4
    //remove,remove,remove Empty
    public static void main(String[] args) {
        String[]arr={"add","add","remove","add","add"};
        int start=1;
        int lastAddedIdx=0;
        int[]arrInt=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("add")){
                arrInt[i]=start;
                start++;
                lastAddedIdx=i;
            }else {
                if( arr[i].equals("remove")){
                    arrInt[lastAddedIdx]=0;
                }
            }
        }
        boolean isEmpty=true;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] != 0) {
                System.out.print(arrInt[i] + " ");
                isEmpty = false;
            }
        }
            if(isEmpty){
                System.out.println("Empty");
            }
    }
}
