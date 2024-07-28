import java.time.LocalDate;

public class Util {
    static long getLongInput(String input) {
        try {
            return Long.parseLong(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        return -1;
    }
    static double getDoubleInput(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        return -1;
    }
    static LocalDate getLocalDate(String input) {
        if (input.equals("null") || input.trim().isEmpty()) {
            return null;
        }
        try {
            return LocalDate.parse(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        return null;
    }

}
