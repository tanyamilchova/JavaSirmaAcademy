import java.util.Scanner;

public class Task27Change {
    //Write a function that accepts an amount - the change that needs to be returned and
    //calculates how many coins are needed.
    //Sample input:
    //input output explanation
    //1.23 4 Our change is 1 lev and 23 stotinki. 4 coins: 1 lev coin, 20
    //
    //stotinki coin, 2 stotinki coin and 1 stotinka coin
    //
    //2 1 Our change is 2 leva. 1 coin of 2 leva.
    //0.56 3 Our change is 56 cents. 3 coins: a 50 stotinki coin, a 5
    //
    //stotinki coin, and a 1 stotinka coin.
    //
    //2.73 5 Our change is 2 leva and 73 stotinki. The machine returns it
    //to us with 5 coins: a 2 leva coin, a 50 stotinki coin, a 20
    //stotinki coin, a 2 stotinki coin, and a 1 stotinki coin.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String amount = sc.nextLine();
        getReturnedCoins(amount);

    }

    private static void getReturnedCoins(String amount) {
        String[]partition=amount.split("\\.");
        int sumLvCoins=0;
        int sumStotinkiCoins=0;
        if(partition.length>0 && partition[0]!=null){
            int  leva = Integer.parseInt(partition[0]);
            int fifths=leva/5;
            int twos=(leva%5)/2;
            int ones=(leva%5%2);
            sumLvCoins+=fifths+twos+ones;
        }
        if(partition.length>1 && partition[1]!=null) {
            int stotinki;
            stotinki=Integer.parseInt(partition[1]);
            int fifths=stotinki/50;
            int twenties=(stotinki%50)/20;
            int tens=(stotinki%50)%20/10;
            int fives=(stotinki%50)%20%10/5;
            int twos=(stotinki%50)%20%10%5/2;
            int ones=(stotinki%50)%20%10%5%2;
            sumStotinkiCoins=fifths+twenties+tens+fives+twenties+ones;
            System.out.println(sumLvCoins+sumStotinkiCoins);
        }
    }
}
