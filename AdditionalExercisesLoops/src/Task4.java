public class Task4 {
    //11111
    //10001
    //10001
    //10001
    //11111
    public static void main(String[] args) {
        int num=5;
        int start=1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i==0 || i==num-1 || j==0 ||j==num-1){
                    System.out.print(start+" ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
