public class Task9 {
    //01110
    //10001
    //10001
    //10001
    //01110
    public static void main(String[] args) {
        int num = 5;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i==0 || i==num-1 ){
//                    System.out.print("0");
                    if(j!=0 && j!=num-1){
                        System.out.print("1");
                    }else {
                        System.out.print("0");
                    }
                }else {
                    if(j==0 || j==num-1) {
                        System.out.print("1");
                    }else {
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
    }
}
