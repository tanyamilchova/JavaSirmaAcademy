package anonymousClasses;

public class Ship {
    void doJob(){
        CustomTest tst=new CustomTest() {
            @Override
            public void test() {
                System.out.println("TEST in Ship");
            }
        };
        tst.test();
    }

    public static void main(String[] args) {
        Ship ship=new Ship();

    }
}
