import java.util.ArrayDeque;
import java.util.Arrays;

public class Task4SimpleCalculator {
    //Create a simple calculator that can evaluate simple expressions that will not
    //hold any operator different from addition and subtraction. There will not be
    //parentheses or operator precedence.
    //Solve the problem using a Stack.
    //Input Output
    //2 + 5 + 10 - 2 - 1 14
    //2 - 2 + 5 5
    public static void main(String[] args) {
        String input="2 - 2 + 5";
//        String input="2 + 5 + 10 - 2 - 1";
        String[]arrInput=input.split(" ");
        ArrayDeque<String>dequePositive=new ArrayDeque<>();
        ArrayDeque<String>dequeNegative=new ArrayDeque<>();

        for (int i = 0; i < arrInput.length; i++) {
            String sign="";
            if(Character.isDigit(arrInput[i].trim().charAt(0))){
                if(i==0){
                    dequePositive.push(arrInput[i]);
                }else {
                    sign = arrInput[i - 1];
                    switch (sign) {
                        case "+" -> dequePositive.push(arrInput[i].trim());
                        case "-" -> dequeNegative.push(arrInput[i].trim());
                    }
                }
            }
            else {
                switch (sign){
                        case "+"->dequePositive.push(arrInput[i+1].trim());
                        case "-"->dequeNegative.push(arrInput[i+1].trim());
                    }
                }
            }

            int posSum=0;
            int negSum=0;
            while (! dequePositive.isEmpty()){
                posSum+=Integer.parseInt(dequePositive.pop());
            }
            while (! dequeNegative.isEmpty()){
                negSum+=Integer.parseInt(dequeNegative.pop());
            }
        System.out.println(posSum-negSum);

        }
}
