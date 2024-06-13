import java.util.Scanner;

public class Task27SurvivalInTheWildness {
    //Players need to decide on their course of action based on time of day, environment, and
    //items:
    // If it&#39;s &#39;day&#39;:
    //o If they&#39;re in a &#39;forest&#39;:
    // If they have &#39;knife&#39;: Hunt for food.
    // Else if they have &#39;container&#39;: Collect berries.
    // Else: Explore.
    //o If they&#39;re in a &#39;desert&#39;:
    // If they have &#39;hat&#39;: Search for water.
    // Else: Find shade.
    //
    // If it&#39;s &#39;night&#39;:
    //o If they&#39;re in a &#39;forest&#39;:
    // If they have &#39;firestarter&#39;: Make a campfire.
    // Else: Climb a tree for safety.
    //o If they&#39;re in a &#39;desert&#39;:
    // If they have &#39;blanket&#39;: Sleep.
    // Else: Keep moving to stay warm.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tymeOfDay=sc.nextLine();
        String environment=sc.nextLine();
        String item=sc.nextLine();
        getCourseOfAction(tymeOfDay,environment,item);

    }

    private static void getCourseOfAction(String tymeOfDay, String environment, String item) {
        String action="";
        if(tymeOfDay.equalsIgnoreCase("day")){
            if(environment.equalsIgnoreCase("forest")) {
                switch (item) {
                    case "knife"->action="Hunt for food";
                    case "container"->action="Collect berries";
                    default->action="Explore";
                }
            }else {
                if(environment.equalsIgnoreCase("desert")){
                    switch (item) {
                        case "hat"->action="Search for water";
                        default->action="Find shade ";
                    }
                }
            }
        }else {
            if(tymeOfDay.equalsIgnoreCase("night")){
                if(environment.equalsIgnoreCase("forest")) {
                    switch (item) {
                        case "firestarter"->action="Make campfire";
                        default->action="Climb a tree for safety";
                    }
                }else {
                    if(environment.equalsIgnoreCase("desert")){
                        switch (item) {
                            case "blanket"->action="Sleep";
                            default->action="Keep moving to stay warm ";
                        }
                    }
                }
            }
        }
        System.out.println(action);
    }
}
