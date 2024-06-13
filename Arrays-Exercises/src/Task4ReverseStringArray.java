public class Task4ReverseStringArray {
    //    public static void main(String[] args) {
    //        String[]arr={"Wednesday","Saturday","Sunday"};
    //        Scanner sc=new Scanner(System.in);
    //        int position=Integer.parseInt(sc.nextLine());
    public static void main(String[] args) {
        String []arr={"a","b","c","d","e"};

        if(arr.length>0){
            for (int i = 0; i < arr.length/2; i++) {
                String temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
