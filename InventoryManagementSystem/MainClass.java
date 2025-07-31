package InventoryManagementSystem;

import java.util.Scanner;

public class MainClass{
	
    public static void main(String[] args){
    	
        InventorySystem inventory=new InventorySystem();
        Scanner sc=new Scanner(System.in);
        int ch;

        do{
            System.out.println("\n1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Search Product");
            System.out.println("4. View All Products");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");
            ch=sc.nextInt();
            sc.nextLine();

            switch(ch){
                case 1:
                    System.out.print("Enter Product name : ");
                    String name=sc.nextLine();
                    System.out.println("\n1 Enter category (PANTS, SHIRTS, TSHIRTS) : ");
                    String prodCategory=sc.nextLine();
                    Category category=Category.valueOf(prodCategory.toUpperCase());
                    System.out.print("Enter quantity : ");
                    int qty=sc.nextInt();
                    inventory.addProduct(name,category,qty);
                    break;

                case 2:
                    System.out.print("Enter product ID to remove : ");
                    int id=sc.nextInt();
                    inventory.removeProduct(id);
                    break;

                case 3:
                    System.out.print("Enter product name to search : ");
                    String searchName=sc.nextLine();
                    inventory.searchProduct(searchName);
                    break;

                case 4:
                    inventory.viewAllProducts();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (ch!=5);
        sc.close();
    }
}
