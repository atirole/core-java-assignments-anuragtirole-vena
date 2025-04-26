package task_10_inventory_system_objectarrays_methods_example;

public class Product
{
    int id;
    String name;
    double price;

    Product(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display()
    {
        System.out.println(id + " - " + name + " - ₹" + price);
    }
}

