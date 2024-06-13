public class Task2 {
    //11111
    //00000
    //11111
    //00000
    //11111
    public static void main(String[] args) {
    int num=5;
    int start=1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i%2==0){
                    System.out.print(start+" ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

}
