import java.util.Scanner;

public class Task20RangeExpences {
    //As a MOBA challenger player, Peter has the bad habit of trashing his PC when he loses a
    //game and rage quits. His gaming setup consists of a headset, mouse, keyboard, and
    //display. You will receive Peter&#39;s lost games count.
    //• Every second lost game, Peter trashes his headset.
    //• Every third lost game, Peter trashes his mouse.
    //• When Peter trashes both his mouse and headset in the same lost game, he also
    //trashes his keyboard.
    //• Every second time he trashes his keyboard, he also trashes his display.
    //You will receive the price of each item in his gaming setup. Calculate his rage expenses
    //for renewing his gaming equipment.
    //• On the first input line - lost games count – integer in the range [0, 1000].
    //• On the second line – headset price - the floating-point number in the range [0,
    //1000].
    //• On the third line – mouse price - the floating-point number in the range [0,
    //1000].
    //• On the fourth line – keyboard price - the floating-point number in the range [0,
    //1000].
    //• On the fifth line – display price - the floating-point number in the range [0,
    //1000].
    //
    //As output, you must print Peter&#39;s total expenses: &quot;Rage expenses: {expenses} lv.&quot;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gameLost = Integer.parseInt(sc.nextLine());
        double headsetPr = Double.parseDouble(sc.nextLine());
        double mousePr = Double.parseDouble(sc.nextLine());
        double keyBoardPr = Double.parseDouble(sc.nextLine());
        double displayPr = Double.parseDouble(sc.nextLine());
        validateInp((double) gameLost,sc);
        validateInp(headsetPr,sc);
        validateInp(mousePr,sc);
        validateInp(keyBoardPr,sc);
        validateInp(displayPr,sc);
        calculateRageExpences(gameLost,headsetPr,mousePr,keyBoardPr,displayPr);
    }

    private static void calculateRageExpences(int gameLost, double headsetPr, double mousePr, double keyBoardPr, double displayPr) {

        int headsetBreaks=gameLost/2;
        int mouseBreaks=gameLost/3;
        int keyboardBreaks=gameLost/6;
        int displayBreacks=keyboardBreaks/2;
         double expences=headsetBreaks*headsetPr+mouseBreaks*mousePr+keyboardBreaks*keyBoardPr+displayBreacks*displayPr;
        System.out.println("Rage expences: "+expences+"lv");
    }

    public static void validateInp(Double item,  Scanner sc) {
        while (item < 0 || item > 1000) {
            System.out.println("The value  " + item + " have to be in range-0 - 1000" );
            item = Double.parseDouble(sc.nextLine());
        }
    }
}