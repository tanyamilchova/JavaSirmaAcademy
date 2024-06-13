package aInh.person2;

public class Superman extends Person2{
    String skills;
    Superman(String skills, String name) {
        super();
        this.skills = skills;
    }
    public String showInfo() {
        return name + " has " + skills;
    }

    public static void main(String[] args) {
        Superman superMan = new Superman("super vision", "Clark Kent");
        System.out.print(superMan.showInfo());
    }
}
