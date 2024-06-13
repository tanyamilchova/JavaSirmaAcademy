package anonymousClasses;

public class Rocket{
    private int x = 10;
    void doJob() {
        final int y = 20;
        CustomTest  tst = new CustomTest() {
            private int z = 10;
            { System.out.print("Init block"); }
            public void test() {
                System.out.print(x + " " +  z + " " + y );
            }
        };
        tst.test();
    }

    void anonimousJob(CustomTest customTest){
        customTest.test();
    }

    public static void main(String[] args) {
        Rocket rocket=new Rocket();
        rocket.doJob();
        rocket.anonimousJob(() -> {
            int x=5;
            for (int i = 0; i < x; i++) {
                System.out.println("Super");
            }
        });
    }
}
