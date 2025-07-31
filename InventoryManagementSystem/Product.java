package InventoryManagementSystem;

public class Product{
	
    private final int id;
    private String name;
    private Category category;

    public Product(int id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) 
        return true;
        if(!(obj instanceof Product)) 
        return false;
        Product p = (Product)obj;
        return this.id==p.id;
    }

    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }
}
