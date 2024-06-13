import java.util.Scanner;

public class Task26PotionBrewingDecision {
    //Players have 2 ingredients to brew potions. Decide which potion they can brew:
    // If they have &#39;herbs&#39;:
    //o If they also have &#39;water&#39;: Brew a health potion.
    //
    //e: office@sirma.bg a: 135 Tsarigradsko Shosse, blvd.
    //m: +359 2 9768310 1784 Sofia, Bulgaria
    //
    //sirma.com
    //o Else if they have &#39;oil&#39;: Brew a stealth potion.
    //o Else: Brew a minor stamina potion.
    // If they have &#39;berries&#39;:
    //o If they also have &#39;sugar&#39;: Brew a speed potion.
    //o Else: Brew a minor energy potion.
    // Else: Can&#39;t brew any potion.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ingrFirst=sc.nextLine();
        String ingrSecond=sc.nextLine();
        getTypeOfPoution(ingrFirst,ingrSecond);

    }

    private static void getTypeOfPoution(String firstIngr, String secondIngr) {
        String poution="";
        if(firstIngr.equalsIgnoreCase("herbs")){
          switch (secondIngr){
              case "water"->poution="Healt potion";
              case "oil"->poution="Stealt potion";
              default->poution="Minor stamina potion";
          }
        }else {
            if(firstIngr.equalsIgnoreCase("beries")){
                switch (secondIngr) {
                    case "sugar" -> poution = "Speed potion";
                    default -> poution = "Minor energy potion";
                }
            }else {
                poution="Any potion";
            }
        }
        System.out.println(poution);
    }
}
