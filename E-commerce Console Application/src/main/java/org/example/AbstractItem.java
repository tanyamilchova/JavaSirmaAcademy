package org.example;

import java.io.Serializable;

public abstract class AbstractItem  implements Item, Categorizable, Breakable,Perishable,Sellable, Serializable {
    public  enum CATEGORY {ELECTRONIC_ITEM, GROSSER_ITEM,FRAGILE_ITEM}
    protected CATEGORY category;
    protected double price;
    protected long quantity;
    protected boolean isBreakable;
    protected boolean isPerishable;
    protected String itemDetails;

        AbstractItem(){
        }
    public AbstractItem(CATEGORY category, double price, long quantity, boolean isBreakable, boolean isPerishable, String itemDetails) {
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.isBreakable = isBreakable;
        this.isPerishable = isPerishable;
        this.itemDetails = itemDetails;
    }

    @Override
    public void getItemDetails() {
        System.out.println(this.itemDetails);
    }
    @Override
    public double calculateValue(double pairs) {
        return this.price*pairs;
    }

    @Override
    public void displayItem() {
        System.out.println(this.itemDetails);
    }
    @Override
    public void setCathegory(CATEGORY cathegory) {
        this.category=cathegory;
    }

    @Override
    public String getCategory() {
        return this.category.toString();
    }
    @Override
    public boolean isBreakable() {
        return this.isBreakable;
    }

    @Override
    public void handleBreakage() {
        System.out.println(" Handle with care to avoid breakage!");
    }

    @Override
    public boolean isPerishable() {return this.isPerishable;}

    @Override
    public void handleExpiration() {
        System.out.println("This product has no expiration date");
    }

    @Override
    public void setPrice(double price) {
        this.price=price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

}
