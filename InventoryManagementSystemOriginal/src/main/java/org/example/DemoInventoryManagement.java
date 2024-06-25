package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class DemoInventoryManagement {

    public static void main(String[] args) {
        Inventory inventory=new Inventory();
        for (int i = 0; i < 1; i++) {
            ElectronicItem el=new ElectronicItem(i+200,1,true,false,"Description"+i,"El"+i+1);
            GroseryItem gr=new GroseryItem(i+150,1,true,false,"Description"+i,"Gr"+i+1, LocalDate.now(),true);
            GroseryItem gr2=new GroseryItem(i+150,1,true,false,"Description"+i,"Gr"+i+1, LocalDate.now(),false);
            FragileItem fR=new FragileItem(i+50,2,true,false,"Description"+i,"Fr"+i,2.0+i);


            inventory.addToMap(el);
            inventory.addToMap(fR);
            inventory.addToMap(gr);
            inventory.addToMap(gr2);
        }
        System.out.println();

        Scanner sc=new Scanner(System.in);
        displayMenu();
        User user=registerUser(sc);
        while (true) {

            chooseAnAction(sc, inventory, user);
        }
    }

    private static void chooseAnAction(Scanner sc,Inventory inventory,User user) {
        System.out.println(".............................");
        System.out.println("Here are the items in stock: ");
        inventory.printMap();
        System.out.println(".............................");
        int choise=Util.getIntInput(sc,"Choose valid action from the menu: ");
        if(isNumbre(choise)){
            switch (choise) {
                case 1 -> {
                    System.out.println("Enter a category");
                    AbstractItem.CATEGORY category=Util.getCategoryInput(sc,"Enter a category");
                    inventory.addItemToInventory(category);
                }
                case 2 -> {
                    AbstractItem.CATEGORY category =Util.getCategoryInput(sc,"Enter the category of the item to be removed");
                    System.out.println("Enter item id to be removed: (ELECTRONIC_ITEM, GROSSER_ITEM, FRAGILE_ITEM)");
                    long id=Util.getLongInput(sc,"Enter item id to be removed");
                    inventory.removeItemById(inventory, category, id);
                }
                case 3 -> {
                    inventory.displayList(Util.getCategoryInput(sc,"Enter a category to display"));
                }
//                case 4 -> {
//                    System.out.println("Create an order");
//                    Order order = user.createOrder();
//                    user.setCurrentOrser(order);
//                }
//                case 5 -> {
//                    Order order = user.getCurrentOrser();
//                    if (Util.checkNotNullOrder(order)) {
//                        AbstractItem.CATEGORY category = Util.getCategoryInput(sc, "Buy an item: enter the category:  ");
//                        inventory = inventory.getInventoryItem(category,inventory);
//                        if(inventory!=null && inventory.getCountFragile()>=0) {
//                            order.addItemToOrder(inventory);
//                            System.out.println("Item List: "+order.getItemList());
//                        }
//                    }
//                }
                case 4 -> {
                    System.out.println("Create an order");
                    Order order = user.createOrder();
                    user.setCurrentOrser(order);
                }
                case 5 -> {
                    Order order = user.getCurrentOrser();
                    if (Util.checkNotNullOrder(order)) {
                        AbstractItem.CATEGORY category = Util.getCategoryInput(sc, "Buy an item: enter the category:  ");
                        int id=Util.getIntInput(sc,"Enter the Id of Item");
                        inventory = inventory.getInventoryItem(category,inventory,id);
                        if(inventory!=null ) {
                            int quantity=Util.getIntInput(sc,"Enter quantity");
                            inventory.setQuantity(quantity);
                            order.addItemToOrder(inventory);
                            System.out.println("Item List: "+order.getItemList());
                        }
                    }
                }
                case 6 -> {
                    Order order = user.getCurrentOrser();
                    if (Util.checkNotNullOrder(order)) {
                        double sum = order.calculateTootalSumOrder();
                        System.out.println("Total sum of order is: " + sum);
                    }
                }
                case 7 -> {
                    Order order = user.getCurrentOrser();
                    if (Util.checkNotNullOrder(order)) {
                        System.out.println("You made an order");
                        order.orderProduct(inventory, user);
                    }
                }
                case 8 -> {
                    System.out.println("Make a payment");
                    user.makePayment();
                }
                case 9 -> {
                    System.out.println("Your details:");
                    user.getUserDetails();
                }
                case 10 -> {
                    System.out.println("Inventory details:");
                    inventory.printMap();
                }
                case 11 -> {
                    System.out.println("Cart details:");
                    Order.showCart();
                }
                case 12 -> {
                   inventory.sortByPrice();
                }
                default -> {
                    System.out.println("Enter a valid number from the menu");
                    choise=Util.getIntInput(sc,"Enter a valid number from the menu");
                }
            }
        }else {
            askValidInput();
        }
    }

    private static User registerUser(Scanner sc) {
        System.out.println("Enter a name");
        String name=sc.nextLine();
//        System.out.println("Enter  money in the wallet");
        double money=Util.getDoubleInput(sc,"Enter  money in the wallet");
//        double money=Double.parseDouble(sc.nextLine());
        User user=new User(name,money);
        return user;
    }

    public static void displayMenu(){
        System.out.println("WELCOME TO E-COMMERCE CONSOLE APPLICATION");
        System.out.println("MENU:"+"\n"+
                "Press 1 to addItem " +"\n"+
                "Press 2 to remove item by id" +"\n"+
                "Press 3 to display list of  category items" +"\n"+
                "Press 4 to create an order" +"\n"+
                "Press 5 to choose item" +"\n"+
                "Press 6 to to calculate order" +"\n"+
                "Press 7 order items" +"\n"+
                "Press 8 to process payment" +"\n"+
                "Press 9 to see user details"+"\n"

        );
        System.out.println("* To use this application you hae to register yourself");
    }
    public static boolean isString(Object objects){
        return objects instanceof String;
    }
    public static boolean isNumbre(Object objects){
        return objects instanceof Number;
    }
    public static void askValidInput(){
        System.out.println("Enter valid input");
    }
}
