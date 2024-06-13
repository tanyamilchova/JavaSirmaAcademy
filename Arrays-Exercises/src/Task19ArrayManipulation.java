import java.util.Arrays;
import java.util.Scanner;

public class Task19ArrayManipulation {
    //Write a program that manipulates an array of numbers.
    // Add {number}: add a number to the end of the array
    // Remove {number}: remove number from the array
    // RemoveAt {index}: removes number at a given index
    // Insert {number} {index}: inserts a number at a given index
    //Print the final state of the array (separated by spaces)
    //The input comes as an array of strings. First input will be a string containing the array to
    //manipulate. Every other command you receive will be a string.
    //The output is the manipulated array printed on the console on a single line, separated by
    //space.
    //Example
    //Input Output
    //4 19 2 53 6 43
    //Add 3, Remove 2, RemoveAt 1, Insert 8 3
    //
    //4 53 6 8 43 3
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String array=sc.nextLine();
        String array="4 19 2 53 6 43";
//        String actions=sc.nextLine();
        String actions="Add 3, Remove 2, RemoveAt 1, Insert 8 3";
        int[]arrInt=populateIntArray(array);
        takeActions(arrInt,actions);




    }

    private static void takeActions(int[]arrInt,String actions) {
        String[]actArr=actions.split(",");
        System.out.println(Arrays.toString(actArr));
        for (int i = 0; i < actArr.length; i++) {
            String manupulation=actArr[i].trim();
            String[]manipArr=manupulation.split(" ");

                String act=manipArr[0];
                switch (act){
                    case "Add"-> arrInt=add(arrInt,Integer.parseInt(manipArr[1].trim()));
                    case "Remove"-> arrInt=remove(arrInt,Integer.parseInt(manipArr[1].trim()));
                    case "RemoveAt"-> arrInt=removeAt(arrInt,Integer.parseInt(manipArr[1].trim()));
                    case "Insert"-> arrInt=insert(arrInt,Integer.parseInt(manipArr[1].trim()),Integer.parseInt(manipArr[2].trim()));
                }
        }

    }

    public static int[] populateIntArray(String array){
        String[]arrStr=array.split(" ");
        int[]arr=new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arr[i]=Integer.parseInt(arrStr[i]);
        }
        System.out.println(Arrays.toString(arr));
//        insert(arr,3,8);
//        remove(arr,2);
//        removeAt(arr,1);
//        add(arr,5);
        return arr;
    }

    private static int[] add(int[] arr, int num) {
        int []resultArr=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            resultArr[i]=arr[i];
        }
        resultArr[resultArr.length-1]=num;
        arr=resultArr;
        System.out.println("Add  "+Arrays.toString(resultArr));
        return resultArr;
    }

    private static int[] removeAt(int[] arr, int pos) {
        int[]resultArr=new int[arr.length-1];
        for (int i =0 ; i < pos; i++) {
            resultArr[i]=arr[i];
        }
        for (int i = pos; i < resultArr.length; i++) {
            resultArr[i]=arr[i+1];
        }
        System.out.println("RemoveAt "+Arrays.toString(resultArr));
        return resultArr;
    }

    private static int[] remove(int[] arr, int num) {
        int[] resultArr=null;
        if(arr.length>0) {
            int idx=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    idx=j;
                }
            }
            resultArr=removeAt(arr,idx);
        }
        System.out.println("Remove "+Arrays.toString(resultArr));
        return resultArr;
    }

    public static int[] insert(int[]arr, int num, int position){

        int[] resultArray = new int[arr.length + 1];
        if(arr.length>0) {

            for (int i = 0; i < position; i++) {
                resultArray[i] = arr[i];
            }
            resultArray[position] = num;
            for (int i = position + 1; i < resultArray.length; i++) {
                resultArray[i] = arr[i - 1];
            }
            System.out.println("Insert  "+Arrays.toString(resultArray));
        }
        return resultArray;
    }
}
