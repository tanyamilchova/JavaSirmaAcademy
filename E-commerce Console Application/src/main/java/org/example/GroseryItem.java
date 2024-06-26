package org.example;

import java.time.LocalDate;

public class GroseryItem extends Inventory{
    protected LocalDate expDate;
    protected boolean isSoldByKg;

    public GroseryItem(double price, long quantity, boolean isBreakable, boolean isPerishable, String itemDetails,  String name, LocalDate expDate, boolean isSoldByKg) {
        super(CATEGORY.GROSSER_ITEM, price, quantity, isBreakable, isPerishable, itemDetails,  name);
        this.expDate = expDate;
        this.isSoldByKg = isSoldByKg;
    }

    @Override
    public double calculateValue(double pairs) {
        if(isSoldByKg){
            int kgInt=(int) pairs;
            return this.price*kgInt;
        }
        return this.price*pairs;
    }

    @Override
    public void displayItem() {
        System.out.printf("id: %d\nname: %s\ncategory: %s\nprice: %.2f\nquantity: %d\nexpDate: %tF\nisSoldByKg: %b\n",
                this.id, this.name, this.category, this.price, this.quantity, this.expDate,this.isSoldByKg);
    }

    @Override
    public void handleExpiration() {
        System.out.println("Use before the expiration date: "+this.expDate);
    }
}
