import java.util.Scanner;

public class Task12PasswordValidator {
    //Write a program that validates passwords. Password rules are:
    // 6 – 10 characters (inclusive)
    // Consists only of letters and digits.
    // Have at least 2 digits.
    //If a password is valid, print &quot;Password is valid&quot;. If it is not valid, for every unfulfilled rule,
    //print a message:
    // &quot;Password must be between 6 and 10 characters&quot;.
    // &quot;Password must contain only letters and digits&quot;.
    // &quot;Password must have at least 2 digits&quot;.
    //Examples
    //Input Output
    //logIn Password must be between 6 and 10 characters
    //
    //Password must have at least 2 digits
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine();
        boolean isValid=validatePasseord(password);
        System.out.println(isValid);
    }

    private static boolean validatePasseord(String password) {
        if(password.length()<2){
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        if(password.length()<6 || password.length()>11){
            System.out.println("Password must be between 6 and 10 characters");
        return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char letter=password.charAt(i);
            if(!Character.isLetterOrDigit(letter)){
                System.out.println("Password must contain only letters and digits");
                return false;
            }
        }
       return true;
    }

}
