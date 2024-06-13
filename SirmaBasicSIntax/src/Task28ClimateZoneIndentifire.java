import java.util.Scanner;

public class Task28ClimateZoneIndentifire {
    // Different areas on Earth have specific climate zones based on latitude. The first line contains a
    //latitude value (between -90 and 90). The second line contains either &quot;N&quot; for Northern
    //Hemisphere or &quot;S&quot; for Southern Hemisphere. The application should identify the climate zone.
    // Arctic Zone: greater than 66.5° (N/S)
    // Temperate Zone: between 23.5° and 66.5° (N/S)
    // Tropic Zone: between 0° and 23.5° (N/S)
    // Equator: exactly 0°
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double latitude=sc.nextDouble();
        sc.nextLine();
        String hemishere=sc.nextLine();
        getClimateZone(latitude,hemishere);
    }

    private static void getClimateZone(double latitude, String hemishere) {
        String climateZone="";
        if(Math.abs(latitude)>66.5 && Math.abs(latitude)<=90){
            climateZone="Arctic Zone";
        }else {
            if(Math.abs(latitude)>23.5 && Math.abs(latitude)<=66.5){
                climateZone="Temperate Zone";
            }else {
                if(Math.abs(latitude)>=0 && Math.abs(latitude)<=23.5){
                    climateZone="Tropic Zone";
                }else {
                    if(latitude==0){
                        climateZone="Equator";
                    }
                }
            }
        }
        System.out.println(climateZone+"("+hemishere+")");
    }


}
