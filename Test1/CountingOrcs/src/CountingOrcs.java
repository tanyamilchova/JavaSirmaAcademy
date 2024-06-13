import java.util.Scanner;

public class CountingOrcs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int initialOrcs=Integer.parseInt(sc.nextLine());
        int increase=Integer.parseInt(sc.nextLine());
        int hour=Integer.parseInt(sc.nextLine());
        int resultOrcs=countOrcs(initialOrcs,increase,hour);
        System.out.println(resultOrcs);
    }
    public static int countOrcs(int initialOrcs, int increase, int hours){
        if(initialOrcs<0 || hours<0){
            return 0;
        }
        return hours*initialOrcs+(hours*(hours-1)*increase)/2;
    }
}
