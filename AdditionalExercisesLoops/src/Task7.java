public class Task7 {
    //11011
    //11011
    //00000
    //11011
    //11011
    public static void main(String[] args) {
        int num=7;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i==num/2){
                    System.out.print("0");
                }else {
                    if(j<num/2 || j>num/2) {
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
    }
}
