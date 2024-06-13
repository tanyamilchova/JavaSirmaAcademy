public class Task14FirstAndLastKNums {
    //Write a program that prints the first k and the last k elements from an array of numbers.
    //The input comes as an array of number elements and k.
    //
    //e: office@sirma.bg a: 135 Tsarigradsko Shosse, blvd.
    //m: +359 2 9768310 1784 Sofia, Bulgaria
    //
    //sirma.com
    //The output is printed on the console on two lines. On the first line print the first k elements,
    //separated by space. On the second line print the last k elements, separated by space.
    //Examples
    //Input Output Input Output
    //2
    //7, 8, 9
    //
    //7 8
    //8 9
    //
    //3
    //6, 7, 8, 9
    //
    //6 7 8
    //7 8 9
    public static void main(String[] args) {
        int k=3;
        int[]arr={};
        if(arr.length>0) {
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (int i = arr.length - k; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
