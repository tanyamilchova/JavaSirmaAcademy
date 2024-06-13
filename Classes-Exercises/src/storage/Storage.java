package storage;

import java.util.ArrayList;

public class Storage {
    private  int capacity;
    private ArrayList<Product> storage=new ArrayList<>();

    public Storage(int capacity) {
        this.capacity= capacity;
    }
    public void addProduct(Product product){
        storage.add(product);
        this.capacity-= product.quantity;
    }
    public String getProducts() {
        StringBuilder json = new StringBuilder();
        for (Product product : this.storage) {
            json.append("{")
                    .append("\"name\":\"").append(product.name).append("\",")
                    .append("\"price\":").append(product.price).append(",")
                    .append("\"quantity\":").append(product.quantity)
                    .append("}\n");
        }
        return json.toString();
    }
    public double totalCost(){
        double sum=0;
        for (int i = 0; i < storage.size(); i++) {
            Product product= storage.get(i);
            sum+=product.price* product.quantity;
        }
        return sum;
    }

    public int getCapacity() {
        return capacity;
    }
}
