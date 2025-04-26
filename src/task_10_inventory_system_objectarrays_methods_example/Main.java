package task_10_inventory_system_objectarrays_methods_example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Store store = new Store();

        store.addProduct(new Product(1, "Vena-Laptop", 50000));
        store.addProduct(new Product(2, "Vena-Phone", 25000));
        store.addProduct(new Product(3, "Vena-Tablet", 30000));

        System.out.println("All Products:");
        store.displayAll();

        store.findHighestPrice();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        store.searchByName(name);
    }
}
