public class Task15 {
    //12345
    //23455
    //34555
    //45555
    //55555
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i < num; i++) {
            int start=i+1;
            for (int j = 0; j < num; j++) {
                if(j<num-i-1) {
                    System.out.print(start++);
                }else {
                    System.out.print(start);
                }
            }
            System.out.println();
        }
    }
}
