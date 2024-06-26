package org.example;

public class FragileItem extends Inventory{
    protected double weight;

    public FragileItem( double price, long quantity, boolean isBreakable, boolean isPerishable, String itemDetails,  String name, double weight) {
        super(CATEGORY.FRAGILE_ITEM, price, quantity, isBreakable, isPerishable, itemDetails,  name);
        this.weight = weight;
    }

    @Override
    public void displayItem() {
        System.out.printf("id: %d\nname: %s\ncategory: %s\nprice: %.2f\nquantity: %d\nweight: %f",
                this.id, this.name, this.category, this.price, this.quantity, this.weight);
    }
}
