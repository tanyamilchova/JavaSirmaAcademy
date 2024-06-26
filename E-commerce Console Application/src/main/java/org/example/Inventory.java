package org.example;

import java.time.LocalDate;
import java.util.*;

public  class Inventory extends AbstractItem  {

    protected  long id;
    protected static long unicId=1;
    protected String name;
    public HashMap<CATEGORY,ArrayList<Inventory>>inventoryHashMap=new HashMap<>();


    public Inventory(){
    }
    public Inventory(CATEGORY category, double price, long quantity, boolean isBreakable, boolean isPerishable, String itemDetails, String name) {
        super(category, price, quantity, isBreakable, isPerishable, itemDetails);
        this.id=unicId++;
        this.name = name;
    }
    public void sortByPrice(){
        ArrayList<Inventory>list=new ArrayList<>();
        for (Map.Entry<CATEGORY,ArrayList<Inventory>> entry:this.inventoryHashMap.entrySet()){
            list.addAll(entry.getValue());
        }
        list.sort((Comparator.comparingDouble(o -> o.price)));
        System.out.println(list);


}
    public void sortByName(){
        ArrayList<Inventory>list=new ArrayList<>();
        for (Map.Entry<CATEGORY,ArrayList<Inventory>> entry:this.inventoryHashMap.entrySet()){
            list.addAll(entry.getValue());
        }
        list.sort((o1,o2)->o1.name.compareTo(o2.name));
    }
    public void sortByCathegory(){
        this.printMap();
    }
    public void displayList(CATEGORY category){
        ArrayList<Inventory>list=inventoryHashMap.get(category);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).displayItem();
            System.out.println("................");
        }
    }
    public Inventory getById(CATEGORY category, int id){
        ArrayList<Inventory>list=inventoryHashMap.get(category);
        if(list !=null) {
            for (int i = 0; i < list.size(); i++) {
                Inventory invTemp=list.get(i);
                if(invTemp.id==id){
                    return invTemp;
                }
            }
        }
        return null;
    }
    public Inventory removeItemById(Inventory inventory, CATEGORY category, long id){
        ArrayList<Inventory>list=this.inventoryHashMap.get(category);
        if (list != null) {
            Iterator<Inventory> iterator = list.iterator();
            while (iterator.hasNext()) {
                Inventory item = iterator.next();
                if (item.getId() == id) {
                    inventory=item;
                    iterator.remove();
                    System.out.println("The item with id: "+item.getId()+" has been removed from GROSSER_ITEM");
                    return inventory;
                }
            }
        }
        return null;
    }
    public Inventory getInventoryItem(CATEGORY category, Inventory inventory, int id){
        ArrayList<Inventory>list=inventoryHashMap.get(category);
        if(! list.isEmpty()) {
            System.out.println("You have added "+category+" to your Order");
            inventory=inventory.getById(category,id);
            if(inventory!=null) {
                if (inventory.getQuantity() == 1) {
                    return removeItemById(inventory,category, id);
                } else {
                    long newQuantity = inventory.getQuantity() - 1;
                    inventory.setQuantity(newQuantity);
                }
            }
                return inventory;
        }else {
            System.out.println("Item Out Of Stock");
            return null;
        }
    }
    public void printMap(){
        for (Map.Entry e:inventoryHashMap.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
    public void addToMap(Inventory inventory){
        CATEGORY c=inventory.category;

        if(! inventoryHashMap.containsKey(c)){
            inventoryHashMap.put(c,new ArrayList<>());
        }
        ArrayList<Inventory>list=inventoryHashMap.get(c);
         list.add(inventory);
         inventoryHashMap.put(c,list);
    }
    public void addItemToInventory(CATEGORY category){
        Scanner sc=new Scanner(System.in);
        Inventory inventory;

        double price = Util.getDoubleInput(sc, "Enter the price:");
        long quantity = Util.getLongInput(sc, "Enter the quantity:");
        boolean isBreakable = Util.getBooleanInput(sc, "Enter isBreakable (true/false):");
        boolean isPerishable = Util.getBooleanInput(sc, "Enter isPerishable (true/false):");
        System.out.println("Enter item details:");
        String itemDetails = sc.nextLine();
        System.out.println("Enter the name:");
        String name = sc.nextLine();

        double weight = 0;
        if (category == CATEGORY.FRAGILE_ITEM) {
            weight = Util.getDoubleInput(sc, "Enter the weight:");
        }

        LocalDate expDate = LocalDate.now().plusDays(45);
        boolean isSoldByKg = true;
        if (category == CATEGORY.GROSSER_ITEM) {
            System.out.println("Expiration date is: " + expDate);
            isSoldByKg = Util.getBooleanInput(sc, "Enter is sold by Kg (true/false):");
        }
        switch (category){
            case ELECTRONIC_ITEM -> inventory=new ElectronicItem( price,  quantity,  isBreakable,  isPerishable,  itemDetails,  name);
            case GROSSER_ITEM -> inventory=new GroseryItem(  price,  quantity,  isBreakable,  isPerishable,  itemDetails,   name,  expDate,  isSoldByKg);
            case FRAGILE_ITEM -> inventory=new FragileItem( price,  quantity,  isBreakable,  isPerishable,  itemDetails,   name,  weight);
            default -> throw new IllegalArgumentException();
        }
            this.addToMap(inventory);
         inventory.displayItem();
        System.out.println();
    }



    public long getId() {
        return id;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public HashMap<CATEGORY, ArrayList<Inventory>> getInventoryHashMap() {
        return inventoryHashMap;
    }

    @Override
    public String toString() {
        return "id:"+this.id+":"+this.name+":"+this.category+":"+this.price+"Quantity:"+this.quantity;
    }




    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Inventory inventory)) return false;
        return id == inventory.id && Objects.equals(name, inventory.name) && Objects.equals(inventoryHashMap, inventory.inventoryHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, inventoryHashMap);
    }
}
