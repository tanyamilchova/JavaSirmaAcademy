import java.util.Scanner;

public class Task9AddressByAgeGender {
    //9. Address by age and gender
    //Write a console program that assumes age (real number) and gender (&#39;m&#39; or &#39;f&#39;), and
    //prints a reference among the following:
    //• &quot;Mr.&quot; — male (sex &#39;m&#39;) 16 years of age or older
    //• &quot;Master&quot; – boy (gender &#39;m&#39;) under 16 years
    //• &quot;Ms.&quot; — woman (sex &#39;f&#39;) 16 years of age or older
    //• &quot;Miss&quot; – girl (gender &#39;f&#39;) under 16
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender = sc.nextLine();
        int age = sc.nextInt();
        getAddress(gender, age);
    }

    private static void getAddress(String gender, int age) {
        if (age >= 16 && age < 130) {
            switch (gender) {
                case "f" -> System.out.println("Ms");
                case "m" -> System.out.println("Mr");
            }
        } else {
            if (age >= 0 && age < 16) {
                switch (gender) {
                    case "f" -> System.out.println("Miss");
                    case "m" -> System.out.println("Master");
                }
            } else {
                System.out.println("Inadequate input");
            }
        }
    }
}





