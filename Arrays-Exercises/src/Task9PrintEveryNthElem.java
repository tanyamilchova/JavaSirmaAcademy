public class Task9PrintEveryNthElem {
    public static void main(String[] args) {
        int n = 2;
        String[] arrCollection={"5","15","31","14","20"};
        for (int i = 0; i < arrCollection.length; i+=n) {
            int num=Integer.parseInt(arrCollection[i].trim());
            System.out.print(num+" ");
        }
    }
}
