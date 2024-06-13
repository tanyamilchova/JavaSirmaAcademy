import java.util.Scanner;

public class Task17NewBuilding {
    //Write a function that displays on the console a building (from top to bottom), while the
    //following conditions are met:
    // On each even floor there are only offices
    // On each odd floor there are only apartments
    // Each apartment is indicated as follows: A{floor number}{apartment number},
    //apartment numbers start from 0.
    // Each office is indicated as follows: O{floor number}{office number}, office
    //numbers also start at 0.
    // On the top floor there are always apartments, and they are larger than the others,
    //so in front of their number it says &#39;L&#39; instead of &#39;A&#39;. If there is only one floor, then
    //there are only large apartments!
    //You accept 2 parameters - the number of floors and the number of rooms per floor.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int floors=Integer.parseInt(sc.nextLine());
        int rooms=Integer.parseInt(sc.nextLine());
        displayABuilding(floors,rooms);
    }

    private static void displayABuilding(int floors, int rooms) {
        for (int i = 1; i <= floors; i++) {

                for (int j = 0; j < rooms; j++) {
                    if(i!=floors) {
                        if (i % 2 == 0) {
                            System.out.print("O" + i + j + " ");
                        } else {
                            System.out.print("A" + i + j + " ");
                        }
                    }else {
                            System.out.print("L" + i + j + " ");
                        }

                    }
            System.out.println();
        }
    }
}
