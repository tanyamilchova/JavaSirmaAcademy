import java.util.Arrays;

public class ANewJavaCourse {

        String courseName = "Java";

    @Override
    public String toString() {
        return this.courseName;
    }

    public static void main(String[] args) {
            ANewJavaCourse courses[] = { new ANewJavaCourse(), new ANewJavaCourse() };
            courses[0].courseName = "MegaCourse";
        System.out.println(Arrays.toString(courses));
//            for (ANewJavaCourse c : courses) {
//                c = new ANewJavaCourse();
//
//            }
        for (int i = 0; i < courses.length; i++) {
            courses[i]=new ANewJavaCourse();
        }
        System.out.println(Arrays.toString(courses));
            for (ANewJavaCourse c : courses) {
                System.out.println(c.courseName);
            }
        }
    }

