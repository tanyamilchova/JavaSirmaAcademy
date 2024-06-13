public class Task13NegPositiveNums {
    //Write a program that processes the elements in an array one by one and produces a new
    //array. Prepend each negative element at the front of the result and append each positive (or
    //0) element at the end of the result.
    //The input comes as an array of number elements.
    //Input Output Input Output
    //7, -2, 8, 9 -2
    //7
    //8
    //9
    //
    //3, -2, 0, -1 -1
    //-2
    //3
    //0
    public static void main(String[] args) {
        String[]arr={"7","-2","-1","8","-4","9"};
        String[] newArr=new String[arr.length];
        StringBuilder result= new StringBuilder();
        StringBuilder resultBuulder=new StringBuilder();
        StringBuilder tempAppended=new StringBuilder();
        boolean start=true;
        for (int i = 0; i < arr.length; i++) {
            int element=Integer.parseInt(arr[i]);
            if(element>=0){
                result.append(arr[i]);

            }else {
                if(start) {
                    resultBuulder.append(arr[i]);
                    start=false;
                }else {
                    tempAppended.append(arr[i]).append(resultBuulder);
                    resultBuulder = tempAppended;
                    tempAppended= new StringBuilder("");
                }
            }
        }
        System.out.println(resultBuulder.append(result));
    }
}
