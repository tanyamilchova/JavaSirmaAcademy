import java.util.Scanner;

public class Task25AdventureGamePathDecision {
    //You&#39;re designing a text-based adventure game. At a certain point, players have to choose a
    //path based on the tools they have in right and left hand:
    // If they have a &#39;sword&#39;:
    //o If they also have a &#39;shield&#39;: Take the path to the castle.
    //o Else: Take the path to the forest.
    // If they have a &#39;map&#39;:
    //o If they also have &#39;coins&#39;: Go to the town.
    //o Else: Camp at the current spot and prepare for the next
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstAtribute=sc.nextLine();
        String secondAtribute=sc.nextLine();
        findPath(firstAtribute,secondAtribute);
    }

    private static void findPath(String atr1, String atr2) {
        String path="";
        if(atr1.equalsIgnoreCase("sword")){
            if(atr2.equalsIgnoreCase("shield")){
                path="Path to the castle.";
            }else {
                path="Path to the forest";
            }
        }else {
            if(atr1.equalsIgnoreCase("map")){
                if(atr2.equalsIgnoreCase("coin")){
                    path="Go to the town.";
                }else {
                    path="Camp";
                }
            }else {
                path="Wander aimlessly.";
            }
        }
        System.out.println(path);
    }
}
