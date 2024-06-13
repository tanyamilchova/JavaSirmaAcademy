public class Task15ExcelSumFormula {
    //Imagine an Excel sheet where each cell contains a number. Write a program that
    //calculates the sum of a given range.
    //Input Output
    //3 3
    //1 2 3
    //
    //21
    //
    //e: office@sirma.bg a: 135 Tsarigradsko Shosse, blvd.
    //m: +359 2 9768310 1784 Sofia, Bulgaria
    //
    //sirma.com
    //4 5 6
    //7 8 9
    //A1:C2
    //4 4
    //0 1 0 0
    //0 0 0 1
    //1 0 0 0
    //0 1 0 0
    //A1:B4
    public static void main(String[] args) {
        String input="A1:C2";
        String first=input.split(":")[0];
        String second=input.split(":")[1];
        String startIString=first.substring(0,1);
        String startJString=first.substring(1,2);

        String endIString=second.substring(0,1);
        String endJString=second.substring(1,2);

        int startI = getIntValue(startIString)-1;
        int startJ = Integer.parseInt(startJString)-1;

        int endI = getIntValue(endIString)-1;
        int endJ = Integer.parseInt(endJString)-1;
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = startI; i <= endI; i++) {
            for (int j = startJ; j <= endJ; j++) {
                int a=arr[i][j];
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
    public static int getIntValue(String input){
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            result *= 26;
            result += input.charAt(i) - 'A' + 1;
        }
      return result;
    }
}
