public class Task8MathPower {
    //Create a method that calculates and returns the value of a number raised to a given
    //power.
    //Examples
    //Input Output
    //2
    //8
    //
    //256
    //
    //5.5
    //3
    //
    //166.37
    //5
    //
    //Create a method that will have two parameters - the number and the power, and will
    //return a result of type double.
    public static void main(String[] args) {
        double base=2;
        int power=8;
        System.out.println(raiseANumToPower(base,power));

    }

    private static double raiseANumToPower(double base, int power) {
        double result=1;
        for (int i = 0; i < power; i++) {
            result*=base;
        }
        return result;
    }
}
