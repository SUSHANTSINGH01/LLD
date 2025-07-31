package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class InventorySystem{
	
    private List<Product> products;
    private Store store;
    private int idCounter;

    public InventorySystem(){
        this.products=new ArrayList<>();
        this.store=new Store();
        this.idCounter=1;
    }

    public void addProduct(String name, Category category, int qty) {
        Product product=new Product(idCounter++, name, category);
        products.add(product);
        store.addProduct(product, qty);
        System.out.println("Product Added");
    }

    public void removeProduct(int id) {
        Product toRemove = null;
        for (Product product : products) {
            if (product.getId() == id) {
            	 products.remove(toRemove);
                 store.removeProduct(toRemove);
                 System.out.println("Product with id : " + id + " Removed");
                 return ;
            }
        }
       
        System.out.println("Product not found with iD " + id);
    }

    public void searchProduct(String name) {
        for(Product product : products){
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println("Product " + name + " found with quantity " + store.getQuantity(product));
                return ;
            }
        }
        System.out.println("No product found with name: " + name);
        
    }

    public void viewAllProducts() {
        for (Product product : products) {
            int qty = store.getQuantity(product);
            System.out.println("Product " + product.getName() + ", Quantity : " + qty);
        }
    }
}

