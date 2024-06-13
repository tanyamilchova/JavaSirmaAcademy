package aInh;

public class Overlog extends Sawing{
    @Override
    public void type(){
        System.out.println("overlog");
    }
    public static String getCategory() {
        return "OverCategory";
    }

    public static void main(String[] args) {
        Sawing current=new Overlog();
        System.out.println(current.getCategory());

        System.out.println(Overlog.getCategory());
    }
}
