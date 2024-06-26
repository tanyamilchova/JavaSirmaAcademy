package org.example;

public class ElectronicItem extends Inventory{

    public ElectronicItem(double price, long quantity, boolean isBreakable, boolean isPerishable, String itemDetails, String name) {
        super(CATEGORY.ELECTRONIC_ITEM, price, quantity, isBreakable, isPerishable, itemDetails,  name);
    }

    @Override
    public double calculateValue(double pairs) {
        int pairsInt=(int)pairs;
        return this.price*pairsInt;
    }

    @Override
    public void displayItem() {
        System.out.printf("id: %d\nname: %s\ncategory: %s\nprice: %.2f\nquantity: %d\n",
                this.id, this.name, this.category, this,price, this.quantity);
    }


}
