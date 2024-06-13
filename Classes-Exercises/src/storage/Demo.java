package storage;

public class Demo {
    public static void main(String[] args) {
        Storage storage=new Storage(50);
        Product product1=new Product("cucumber",1.50,15);
        Product product2=new Product("tomato",0.9,25);
        Product product3=new Product("bread",1.10,8);
    storage.addProduct(product1);
    storage.addProduct(product2);
    storage.addProduct(product3);
    System.out.println(storage.getProducts());
        System.out.println(storage.getCapacity());
        System.out.println(storage.totalCost());

    }
}
