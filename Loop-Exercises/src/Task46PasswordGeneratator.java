import java.util.Scanner;

public class Task46PasswordGeneratator {
    //Write a program that takes two integers n and l and generates alphabetically all possible
    //passwords that consist of the following 5 characters:
    //• Symbol 1: digit from 1 to n.
    //• Symbol 2: digit from 1 to n.
    //• Symbol 3: lowercase letter among the first l letters of the Latin alphabet.
    //• Symbol 4: a lowercase letter among the first l letters of the Latin alphabet.
    //• Symbol 5: a digit from 1 to n, greater than the first 2 digits.
    //Sample input:
    //3
    //1
    //
    //11aa2
    //11aa3
    //12aa3
    //21aa3
    //22aa3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int l = Integer.parseInt(sc.nextLine());
        generatePassword(n,l);
    }

    private static void generatePassword(int n, int l) {
        String symb1="";
        String symb2="";
        String symb3="";
        String symb4="";
        String symb5="";


        for (int i = 1; i < n; i++) {
            symb1= String.valueOf(i);
            for (int j = 1; j < n; j++) {
                symb2 = String.valueOf(j);
                for (int m = 0; m < l; m++) {
                    symb3 = String.valueOf((char) ('a' + m));
                    for (int k = 0; k < l; k++) {
                        symb4 = String.valueOf((char) ('a' + k));
                        for (int o = 1; o <= n; o++) {

                            String resultNum="";

                            resultNum=resultNum.concat(symb1);
                            resultNum = resultNum.concat(symb2);
                            resultNum = resultNum.concat(symb3);
                            resultNum = resultNum.concat(symb4);
                            if (o<=Integer.parseInt(symb1) || o<=Integer.parseInt(symb2)) {
                                continue;
                            }
                            symb5 = String.valueOf(o);
                            resultNum = resultNum.concat(symb5);
                            System.out.println(resultNum);
                        }
                    }
                }
            }
        }
    }
}

