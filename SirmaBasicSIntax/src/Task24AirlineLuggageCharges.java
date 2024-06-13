import java.util.Scanner;

public class Task24AirlineLuggageCharges {
    //Write a console program that calculates luggage charges based on weight and dimensions:
    // If weight &gt; 50kg: $100 overweight fee.
    // If the sum of all dimensions (length + width + height) &gt; 158cm:
    //o If the sum exceeds by 1-20cm: $50 oversize fee.
    //o If the sum exceeds by 21-50cm: $100 oversize fee.
    //o If the sum exceeds by more than 50cm: $200 oversize fee.
    // If both overweight and oversize: additional $50 handling fee.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
        int dimension=sc.nextInt();
        getLuggageCharge(weight,dimension);
    }

    private static void getLuggageCharge(int weight, int dimension) {
        int overweiight=0;
        int oversize=0;
        int handling=0;

        if(weight>50){
           overweiight=100;
        }
        if(dimension>158){
            if(dimension-158<=20){
                oversize=50;
            }else {
                if(dimension-158<=50){
                    oversize=100;
                }else {
                    oversize=200;
                }
            }
        }
        if(oversize!=0 && overweiight!=0){
            handling=50;
        }
        System.out.println("$"+(oversize+overweiight+handling));
    }
}
