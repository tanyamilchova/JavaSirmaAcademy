public class Task8 {
    //10001
    //01010
    //00100
    //01010
    //10001
    public static void main(String[] args) {
        int num = 5;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i==j || j==num-i-1){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
