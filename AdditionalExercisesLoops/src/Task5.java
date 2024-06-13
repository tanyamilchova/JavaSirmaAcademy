public class Task5 {
    //11111
    //11111
    //11011
    //11111
    //11111
    public static void main(String[] args) {
        int num=5;
        int start=1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i<=1 || i>=num-2 || j<=1 ||j>=num-2){
                    System.out.print(start+" ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
