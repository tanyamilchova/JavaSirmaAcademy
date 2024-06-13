public class Task22NumsEndingInSeven {
    //22. Numbers up to 1000, ending in 7
    //
    //Write a program that prints the numbers in the range [1... 1000], which end in 7.
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if(((i+1)%10)==7){
                System.out.println(i+1);
            }
        }
    }
}
