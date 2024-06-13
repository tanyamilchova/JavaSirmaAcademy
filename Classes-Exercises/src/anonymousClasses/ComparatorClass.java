package anonymousClasses;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorClass {
    public static void main(String[] args) {


        String[] arr = {"java", "scala", "fortran", "ada", "modula"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String str1 = (String) o1;
                String str2 = (String) o2;
                return str2.compareTo(str1);
            }
        });
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,(o1,o2)->o1.compareTo(o2));
        Arrays.sort(arr, String::compareTo);
    }
}
