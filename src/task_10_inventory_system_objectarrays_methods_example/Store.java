package task_10_inventory_system_objectarrays_methods_example;

public class Store
{
    Product[] products = new Product[5];
    int count = 0;

    void addProduct(Product p)
    {
        products[count] = p;
        count++;
    }

    void displayAll()
    {
        for (int i = 0; i < count; i++)
        {
            products[i].display();
        }
    }

    void findHighestPrice()
    {
        Product max = products[0];
        for (int i = 1; i < count; i++)
        {
            if (products[i].price > max.price) {
                max = products[i];
            }
        }
        System.out.println("Highest Priced Product:");
        max.display();
    }

    void searchByName(String name)
    {
        boolean found = false;
        for (int i = 0; i < count; i++)
        {
            if (products[i].name.equalsIgnoreCase(name))
            {
                System.out.println("Product Found:");
                products[i].display();
                found = true;
                break;
            }
        }
        if (!found)
        {
            System.out.println("Product not found!");
        }
    }
}

