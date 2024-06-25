package org.example;

import java.util.ArrayList;

public class Order {

    private long id;
    private static long unicId =1;
    private long userId;
    private double total;
    public static ArrayList<Inventory>itemList=new ArrayList<>();


    public Order(long userId) {
        this.id = unicId++;
        this.userId=userId;
    }


    public  void addItemToOrder(Inventory item){
        this.itemList.add(item);
        System.out.println("Order Item List "+this.itemList);
    }
public void orderProduct(Inventory inventory, User user){

        if(itemList.isEmpty()){
            System.out.println("No items in order list");
        }else {
            for (int i = 0; i < itemList.size(); i++) {
                AbstractItem item = itemList.get(i);
                Inventory.CATEGORY category = AbstractItem.CATEGORY.valueOf(item.getCategory());
                ArrayList<Inventory> list = inventory.inventoryHashMap.get(category);
//                for (int j = 0; j < item.quantity; j++) {
//                    if(! list.isEmpty()) {
//                        list.remove(list.size() - 1);
//                    }else {
//                        System.out.println("Out of stock");
//                    }
//                }
                inventory.inventoryHashMap.put(category, list);
            }
                user.addOrderToList(user.getCurrentOrser());
                user.setCurrentOrser(null);
        }
    }

    public double calculateTootalSumOrder(){
        double sum=0;
        for (int i = 0; i < itemList.size(); i++) {
            AbstractItem item=itemList.get(i);
            for (int j = 0; j < item.quantity; j++) {
                sum+=item.getPrice();
            }
        }
        this.total=sum;
        System.out.println("Total for this order: "+sum);
        return sum;
    }

    public long getId() {
        return id;
    }

    public double getTotal() {
        return this.total;
    }

    public ArrayList<Inventory> getItemList() {
        return itemList;
    }
    public static void showCart(){
        System.out.println(itemList);
    }

    @Override
    public String toString() {
        return "Order: "+String.valueOf( this.id);
    }
}
