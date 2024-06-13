public class Task13 {
    //1 2 3 4 5
    //6 7 8 9 10
    //11 12 13 14 15
    //16 17 18 19 20
    //21 22 23 24 25
    public static void main(String[] args) {
        int num = 5;
        int start=1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(start++);
            }
            System.out.println();
        }
    }
}
