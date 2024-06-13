
import java.util.Scanner;

public class CouncilElrond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String voteResult=getDecision(input);
        System.out.println(voteResult);

    }

    private static String getDecision(String input) {

        if (checkInput(input)) {
            String[] arr = input.split(",");
            int countYes = 0;
            int countNo = 0;
            boolean hasAbstain = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].trim().equals("Abstain")) {
                    hasAbstain = true;
                } else {
                    if (arr[i].trim().equals("Yes")) {
                        countYes++;
                    } else {
                        if (arr[i].trim().equals("No")) {
                            countNo++;
                        }
                    }
                }
            }
            if (countYes > countNo) {
                return "Yes";
            } else {
                if (countYes == countNo) {
                    if (countYes == 0 && hasAbstain) {
                        return "Abstain";
                    } else {
                        return "Tie";
                    }
                } else {

                    return "No";
                }
            }
        }
        return null;
    }
    public static boolean checkInput(String input){
        if(input==null || input.isBlank()){
            return false;
        }
        String[]arr=input.split(",");
        for (int i = 0; i < arr.length; i++) {
            if(!( (arr[i].trim().equals("Yes")) ||(arr[i].trim().equals("No"))  || (arr[i].trim().equals("Abstain")) )){
                return false;
            }
        }
        return true;
    }
}
// Uifsf!jt!b!tfdsfu", 1