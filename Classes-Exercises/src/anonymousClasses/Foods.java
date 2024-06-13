package anonymousClasses;

public class Foods {
    Cookable c = new Cookable() {
        public void cook() {
            System.out.println("anonymous cookable implementer");
        }
    };
    public static void main(String[] args) {
        Foods food = new Foods();
        food.c.cook();

    }
}

