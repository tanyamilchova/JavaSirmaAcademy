package org.example;

public class A {
//    public enum CATEGORY1 {ELECTRONIC_ITEM,GROSSERY_ITEM,FRAGILE_ITEM}
    protected long id;
    protected String name;
    protected long quantity;
    protected double price;
    protected Inventory.CATEGORY category;

    protected double calculateValue(double pairs) {
        int pairsInt=(int)pairs;
        return this.price*pairsInt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Inventory.CATEGORY getCategory() {
        return category;
    }

    public long getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public A(long id, String name, long quantity, double price, Inventory.CATEGORY category) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;


    }

    public static void main(String[] args) {
        A a=new A(1,"A",3,10, Inventory.CATEGORY.ELECTRONIC_ITEM);
//        System.out.printf("id: %d\\nname: %s\\ncategory: %s\\nprice: %d\\nquantity: %d", a.getId(), a.getName(), a.getCategory(), a.getPrice(),a.getQuantity()");
        System.out.printf("id: %d\nname: %s\ncategory: %s\nprice: %.2f\nquantity: %d\n",
                a.getId(), a.getName(), a.getCategory(), a.getPrice(), a.getQuantity());
        System.out.println(a.calculateValue(5.2));
    }
}
