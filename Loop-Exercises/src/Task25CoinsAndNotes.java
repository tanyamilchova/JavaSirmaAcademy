import java.util.Scanner;

public class Task25CoinsAndNotes {
    //Write a function that accepts an amount - the change that needs to be returned and
    //calculates how many coins are needed.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oneLvCoin=Integer.parseInt(sc.nextLine());
        int twoLvCoin=Integer.parseInt(sc.nextLine());
        int fiveLvCoin=Integer.parseInt(sc.nextLine());
        int target=Integer.parseInt(sc.nextLine());

        calculateCions(oneLvCoin,twoLvCoin,fiveLvCoin,target);
    }

    private static void calculateCions(int oneLvCoin, int twoLvCoin, int fiveLvCoin, int target) {
        int temp=0;

        for (int i = 0; i <= fiveLvCoin; i++) {
            for (int j = 0; j <= twoLvCoin; j++) {
                for (int k = 0; k <= oneLvCoin; k++) {
                    temp=5*i+2*j+k;
                    if (temp==target){
                        System.out.println(k+"*1 lv"+j+"*2 lv"+i+"*5 lv");
                    }
                }
            }
        }
    }
}
