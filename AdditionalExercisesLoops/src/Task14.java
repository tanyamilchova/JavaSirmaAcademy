public class Task14 {
    //55555
    //54444
    //54333
    //54322
    //54321
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i < num; i++) {
            int start=5;
            for (int j = 0; j < num; j++) {
                if(j<i) {
                    System.out.print(start--);
                }else {
                    System.out.print(start);
                }
            }
            System.out.println();
        }
    }
}
