import java.util.Scanner;

public class Task12SimpleCalculator {
    //12. Simple Calculator
    //
    //Write a function that receives two numbers and an operation and prints the result of it.
    // add +
    // subtract -
    // divide /
    // multiply *
    //Format the result to two decimal places.
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    double num1=sc.nextDouble();
    double num2=sc.nextDouble();
    sc.nextLine();
    String operation=sc.nextLine();
    calculateOperation(num1,num2,operation);
}

    private static void calculateOperation(double num1, double num2, String operation) {
        double result=0;
        switch (operation){
            case "+"->result=num1+num2;
            case "-"->result=num1-num2;
            case "*"->result=num1*num2;
            case "/"->result=num1/num2;
        }
        System.out.printf("%.2f",result);
    }
}
