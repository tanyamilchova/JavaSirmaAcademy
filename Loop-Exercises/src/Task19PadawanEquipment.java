import java.util.Scanner;

public class Task19PadawanEquipment {
    //Yoda is starting his newly created Jedi academy. So, he asked Master George Lucas to
    //buy the needed equipment. The number of items depends on how many students will sign
    //up. The equipment for the Padawan contains lightsabers, belts, and robes.
    //You will be given the amount of money George Lucas has, the number of students, and
    //the prices of each item. You must help George Lucas calculate if the money he has is
    //enough to buy all of the equipment or how much more money he needs.
    //Because the lightsabers sometimes break, George Lucas should buy 10% more, rounded
    //up to the next integer. Also, every sixth belt is free.
    //The input data consist of exactly 5 lines:
    //• The amount of money George Lucas has – the floating-point number in the
    //range [0.00…1,000.00].
    //• The count of students – integer in the range [0…100].
    //• The price of lightsabers for a single saber – the floating-point number in the
    //range [0.00…100.00].
    //• The price of robes for a single robe – the floating-point number in the range
    //[0.00…100.00].
    //• The price of belts for a single belt – the floating-point number in the range
    //[0.00…100.00].
    //
    //The output should be printed on the console.
    //• If the calculated price of the equipment is less or equal to the money George
    //Lucas has:
    //o &quot;The money is enough - it would cost {the cost of the equipment}lv.&quot;
    //• If the calculated price of the equipment is more than the money George Lucas
    //has:
    //o &quot;George Lucas will need {neededMoney}lv more.&quot;
    //All prices must be rounded to two digits after the decimal point.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double money=Double.parseDouble(sc.nextLine());
        int students=Integer.parseInt(sc.nextLine());
        double saberPr=Double.parseDouble(sc.nextLine());
        double robePr=Double.parseDouble(sc.nextLine());
        double beltPr=Double.parseDouble(sc.nextLine());
//
        validateInput(money,1000,sc);
        validateInput((double)students,100,sc);
        validateInput(saberPr,100,sc);
        validateInput(robePr,100,sc);
        validateInput(beltPr,100,sc);



        calculateEquipment(money,students,saberPr,robePr,beltPr);
    }

    private static void calculateEquipment(double money, int students, double saberPr, double robePr, double beltPr) {
        int numLightSobers= (int) Math.ceil( students+0.1*students);
        int numBelts=students-students/6;
        double sum=numLightSobers*saberPr+students*robePr+numBelts*beltPr;
        if(money>=sum){
            System.out.println("The money is enough - it would cost "+sum);
        }else {
            System.out.println("George Lucas will need "+(money-sum)+" more");
        }

    }
    public static void validateInput(Double item,int value,Scanner sc){
        while (item<0 || item>value){
            System.out.println("The value  "+item+" have to be in range-0 - "+value);
            item=Double.parseDouble(sc.nextLine());
        }
    }
}
