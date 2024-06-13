import java.util.Scanner;

public class Task4Calculator {
    //Write a program that receives a string on the first line (&quot;add&quot;, &quot;multiply&quot;, &quot;subtract&quot;,
    //&quot;divide&quot;) and on the next two lines receives two numbers. Create four methods (for
    //each calculation) and invoke the right one depending on the command. The method
    //should also print the result (it needs to be void).
    //Input Outpu
    //t
    //subtrac
    //t
    //5
    //4
    //
    //1
    //
    //divide
    //8
    //4
    //
    //2
    public static void subtract(int num1,int num2){
        System.out.println(Math.abs(num1-num2));
    }
    public static void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    public static void multiply(int num1,int num2){
        System.out.println(num1*num2);
    }
    public static void divide(int num1,int num2){
        System.out.println(num1/num2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String operation=sc.nextLine();
        int num1=Integer.parseInt(sc.nextLine());
        int num2=Integer.parseInt(sc.nextLine());
        calculate(operation,num1,num2);

    }

    private static void calculate(String operation, int num1, int num2) {
        switch (operation){
            case "subtract"->subtract(num1,num2);
            case "divide"->divide(num1,num2);
            case "multiply"->multiply(num1,num2);
            case "add"->add(num1,num2);
        }
    }
}
