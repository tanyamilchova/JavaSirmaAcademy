import java.util.Scanner;

public class Task9GreaterOfTwoValues {

    private static String getMax( String val1, String val2) {
        if(val1.compareTo(val2)>0){
            return val1;
        }
        return val2;

    }
    private static char getMax( char val1, char val2) {
        if(val1-val2>0){
            return val1;
        }
        return val2;
    }
    private static int getMax( int val1, int val2) {
        return Math.max(val1,val2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String type=sc.nextLine();

        if(type.equals("int")){
            int max=getMax(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            System.out.println(max);
        }else {
            if(type.equals("char")){
                char max=getMax(sc.nextLine().charAt(0),sc.nextLine().charAt(0));
                System.out.println(max);
            }else {
                if(type.equals("String")){
                    String str1=sc.nextLine();
                    String str2=sc.nextLine();
                    String max=getMax(str1,str2);
                    System.out.println(max);
                }
            }
        }
    }
}
