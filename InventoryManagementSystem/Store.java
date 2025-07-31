package InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Store {
	
    private Map<Product, Integer> quantities;

    public Store(){
    	quantities=new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
    	quantities.put(product, quantities.getOrDefault(product, 0) + quantity);
    }

    public boolean removeProduct(Product product) {
        return quantities.remove(product)!=null;
    }

    public int getQuantity(Product product) {
        return quantities.getOrDefault(product, 0);
    }

    public Map<Product, Integer> getAllProducts() {
        return quantities;
    }
}
