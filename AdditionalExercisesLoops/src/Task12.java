public class Task12 {
    //12345
    //23456
    //34567
    //45678
    //56789
    public static void main(String[] args) {
        int num = 5;
        int start=1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(start++);
            }
            System.out.println();
            start=i+2;
        }
    }
}
