import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C1 {
    public static void main(String[] args) {
       String text="Marry: 123";
       String regex="([A-Z][a-z]+): (?<number>\\d)";
        Pattern pattern1=Pattern.compile(regex);
        Matcher matcher=pattern1.matcher(text);

        System.out.println(matcher.find());
        System.out.println(matcher.group());
        System.out.println(matcher.group(0));
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(2));
        System.out.println(matcher.group("number"));


    }
}
