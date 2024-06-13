import java.util.ArrayList;
import java.util.Scanner;

public class RohanCavalryFormation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arrString=sc.nextLine();
        ArrayList<Integer> cavalery = convertToInteger(arrString);
        ArrayList<String>commands=new ArrayList<>();
        while (true){
            String command=sc.nextLine();
            if(command.equals("end")){
                break;
            }
            commands.add(command);
        }

        for (String comand:commands){
            String []arrComand=comand.split(" ");
            String nameCommand=arrComand[0].trim();
            String numToAct="";
            int pos1=0;
            int pos2=0;
            if(arrComand.length==2){
                numToAct=arrComand[1].trim();
            }
            if (arrComand.length == 3) {
                pos1 = Integer.parseInt(arrComand[1].trim());
                pos2 = Integer.parseInt(arrComand[2].trim());
            }

            switch (nameCommand){
                case "destroy"->destroy(numToAct,cavalery);
                case "swap"->swap(pos1,pos2,cavalery);
                case "add"->addEl(numToAct,cavalery);
                case "insert"->insert(pos1,pos2,cavalery);
                case "center"->center(cavalery);
                default -> System.out.println("Wrong command");
            }
        }
    }

    private static ArrayList<Integer> center(ArrayList<Integer> cavaleryArray) {
        if(cavaleryArray==null || cavaleryArray.isEmpty()) {
            return null;
        }
        ArrayList<Integer> newFormation = new ArrayList<>(cavaleryArray);
            if(newFormation.size()%2==0){
                System.out.print(newFormation.get(newFormation.size()/2-1)+" ");
                System.out.print(newFormation.get(newFormation.size()/2));
            }else {
                System.out.println(newFormation.get(newFormation.size()/2));
            }
        return  newFormation;
    }


    private static ArrayList<Integer> insert( int number,int pos2, ArrayList<Integer> cavaleryArray) {
        if(cavaleryArray==null || cavaleryArray.isEmpty()    || pos2<0) {
            return null;
        }
        cavaleryArray.add(pos2,number);
        printArray(cavaleryArray);
        return  cavaleryArray;
    }

    private static ArrayList<Integer> addEl(String numToAct, ArrayList<Integer> cavaleryArray) {
        if(cavaleryArray==null  || cavaleryArray.isEmpty()) {
            return null;
        }
        cavaleryArray.add(Integer.parseInt(numToAct));
        printArray(cavaleryArray);
        return  cavaleryArray;
    }

    private static ArrayList<Integer> swap(int pos1, int pos2, ArrayList<Integer> cavaleryArray) {
        if(cavaleryArray==null || cavaleryArray.isEmpty() || pos1>=cavaleryArray.size() || pos2>=cavaleryArray.size() || pos1<0 && pos2<0) {
            return null;
        }
        int temp = cavaleryArray.get(pos1);
        cavaleryArray.set(pos1, cavaleryArray.get(pos2));
        cavaleryArray.set(pos2, temp);
        printArray(cavaleryArray);
        return  cavaleryArray;
    }
    public static ArrayList<Integer> destroy(String numToAct,ArrayList<Integer>cavaleryArray) {
        if(cavaleryArray==null || cavaleryArray.isEmpty() || Integer.parseInt(numToAct)>=cavaleryArray.size() || Integer.parseInt(numToAct)<0) {
            return null;
        }
        cavaleryArray.remove(Integer.parseInt(numToAct));
        printArray(cavaleryArray);
        return  cavaleryArray;
    }
    public static ArrayList<Integer>convertToInteger(String cavalery){
        if(cavalery==null || cavalery.isEmpty()){
            return  null;
        }
        ArrayList<Integer>cavaleryInteger=new ArrayList<>();
        String []arr=cavalery.split(",");
        for (String s : arr) {
            int element = Integer.parseInt(s.trim());
            cavaleryInteger.add(element);
        }
        return cavaleryInteger;
    }
    public static void printArray(ArrayList<Integer>list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
