import java.util.Arrays;

public class Task18ListOfProducts {
    //You will receive an array of products. Print a numbered array of all the products ordered
    //by name.
    //Example
    //Input Output
    //Potatoes, Tomatoes, Onions, Apples 1.Apples
    //2.Onions
    //3.Potatoes
    //4.Tomatoes
    public static void main(String[] args) {
        String[]arr={"Potatoes","Tomatoes","Onions","Apples"};
        for (int i = 0; i < arr.length; i++) {
            char iCh=arr[i].charAt(0);
            for (int j = 0; j < arr.length-1; j++) {
                char jChar=arr[j].charAt(0);
                if(arr[j].charAt(0)>arr[j+1].charAt(0)){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+"."+arr[i]);
        }
    }
}
