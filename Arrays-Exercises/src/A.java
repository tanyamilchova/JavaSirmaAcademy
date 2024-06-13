import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        String[]arr={"Potatoes","Tomatoes","Onions","Apples"};
//        Arrays.sort(arr);

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
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println((i+1)+"."+arr[i]);
//        }
//        Scanner sc=new Scanner(System.in);
//        List<Integer>list=Arrays.stream(sc.nextLine().split(","))
//                .map(Integer::parseInt)
//                .toList();decompile
    }
}
