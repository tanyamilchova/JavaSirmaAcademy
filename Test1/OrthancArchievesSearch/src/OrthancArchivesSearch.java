import java.util.Scanner;

public class OrthancArchivesSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputList=sc.nextLine();
        String searched=sc.nextLine();
        String[]arrInput=inputList.split(",");
        getFirstLastOccurrence(arrInput,searched);
    }

    private static void getFirstLastOccurrence(String[] arrInput, String searched) {
        int first=-1;
        int last=-1;
        boolean hasFirst=false;
        for (int i = 0; i < arrInput.length; i++) {
            if (arrInput[i].trim().equals(searched)){
                if(first==-1 ) {
                    first = i;
                } else {
                    last=i;
                }
            }
        }
        System.out.println("First Occurrence: "+first);
        System.out.println("Last Occurrence: "+last);
    }
}
