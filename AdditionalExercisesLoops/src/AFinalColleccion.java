import java.util.ArrayList;
public class AFinalColleccion {


        private final ArrayList friends = new ArrayList<>();
        public ArrayList getFriends() {
            return friends;
        }
        public void addFriend(AFinalColleccion friend) {
            friends.add(friend);
        }


        public static void main(String[] args) {
            AFinalColleccion man1 = new AFinalColleccion();
            AFinalColleccion man2 = new AFinalColleccion();
            AFinalColleccion man3 = new AFinalColleccion();

            System.out.println(man3.getFriends());
            man3.addFriend(man1);
            man3.addFriend(man2);
            System.out.println(man3.getFriends());
        }

}
