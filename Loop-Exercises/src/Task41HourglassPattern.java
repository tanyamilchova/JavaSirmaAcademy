import java.util.Scanner;

public class Task41HourglassPattern {
    //Draw an hourglass pattern:
    //Inpu
    //t
    //Output
    //5 #######
    //   #   #
    //    # #
    //     #
    //    # #
    //   #   #
    //  #######
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        drawAHourglass(rows);
    }

    private static void drawAHourglass(int rows) {
        int innerSpases=rows-2;
        int spaces=1;
        int secondInner=2;

        for (int i = 0; i < rows/2+1; i++) {
            if(i==0 ){
                for (int j = 0; j < rows + 2; j++) {
                    System.out.print("*");
                }
            }else {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("#");
                for (int j = 0; j < innerSpases; j++) {
                    System.out.print(" ");
                }
                System.out.print("#");
                spaces++;
                innerSpases-=2;
            }
            System.out.println();
            if(rows%2!=0 && i==rows/2) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("#");
                System.out.println();
            }
        }
        spaces--;

        for (int i = 0; i < rows/2+1; i++) {
            if(i==rows/2 ){
                for (int j = 0; j < rows + 2; j++) {
                    System.out.print("*");
                }
            }else {
                spaces--;
                for (int j = 0; j <spaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("#");
                for (int j = 0; j < secondInner; j++) {
                    System.out.print(" ");
                }
                System.out.print("#");
                secondInner+=2;

            }
            System.out.println();
        }
    }
}
