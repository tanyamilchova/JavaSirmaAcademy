package aInh.animal;

public class Main {
        public static void main(String[] arg) {
//            BritishCat cat2 = (BritishCat)cat;
//            PersianCat cat3 = (PersianCat)cat;
            Cat cat = new BritishCat();
            if (cat instanceof PersianCat) {
                System.out.println("Persian cat!");
                PersianCat сat3 = (PersianCat) cat;
            } else {
                System.out.println("Not Persian cat!");
            }
            cat.move();
        }
    }
