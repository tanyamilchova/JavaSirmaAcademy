package epam;

public class Outer {
    public  String name;
    void getAccess(){

        Inner inner=new Inner();
        System.out.println(inner.age);
    }
    public  class Inner{
        public int age;
        void getOuterAccess(){
            System.out.println(name);
        }
    }

}
