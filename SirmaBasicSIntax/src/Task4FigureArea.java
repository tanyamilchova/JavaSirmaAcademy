import java.util.Scanner;

public class Task4FigureArea {
    //
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double area=0;
        String figureType=sc.nextLine();

       switch (figureType){
           case "circle" -> {
               double r=Double.parseDouble(sc.nextLine());
               area=3.14*r*r;
           }
           case "triangle"->{
               double side=Double.parseDouble(sc.nextLine());
               double height=Double.parseDouble(sc.nextLine());
               area=side*height/2;

           }
           case "rectangle"->{
               double sideA=Double.parseDouble(sc.nextLine());
               double sideB=Double.parseDouble(sc.nextLine());
               area=sideA*sideB;
           }
           case "square"->{
               double side=Double.parseDouble(sc.nextLine());
               area=side*side;
           }
           default -> System.out.println("Wrong input");
       }
        System.out.println(area);
    }
}
