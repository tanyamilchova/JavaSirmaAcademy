import java.util.Scanner;

public class Task11MathOperations {
    //
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=Integer.parseInt(sc.nextLine());
        String operation=sc.nextLine();
        int num2=Integer.parseInt(sc.nextLine());

        calculateResult(num1,operation,num2);
    }

    private static void calculateResult(int num1, String operation, int num2) {
        switch (operation){
            case "/"-> {
                if(num2!=0) {
                    System.out.println(num1/num2);
                }else {
                    System.out.println("Division by zero");
                }
            }
            case "*"-> System.out.println(num1*num2);
            case "+"-> System.out.println(num1+num2);
            case "-"-> System.out.println(num1-num2);
        }

    }
}
