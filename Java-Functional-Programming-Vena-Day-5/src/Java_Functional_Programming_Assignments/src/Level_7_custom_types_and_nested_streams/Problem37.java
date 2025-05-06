package Level_7_custom_types_and_nested_streams;

// Problem37.java
// Find the order with the highest total item price.
import java.util.*;
import java.util.stream.*;

public class Problem37
{
    static class Item
    {
        private String name;
        private double price;
        public Item(String name, double price)
        {
            this.name = name;
            this.price = price;
        }
        public double getPrice()
        {
            return price;
        }
    }

    static class Order
    {
        private List<Item> items;
        public Order(List<Item> items)
        {
            this.items = items;
        }
        public List<Item> getItems()
        {
            return items;
        }

        public double getTotalPrice()
        {
            return items.stream().mapToDouble(Item::getPrice).sum();
        }
    }

    public static void main(String[] args)
    {
        List<Order> orders = Arrays.asList(
                new Order(Arrays.asList(new Item("Book", 200), new Item("Pen", 20))),
                new Order(Arrays.asList(new Item("Tablet", 1000))),
                new Order(Arrays.asList(new Item("Phone", 500), new Item("Charger", 100)))
        );

        Order maxOrder = orders.stream()
                .max(Comparator.comparingDouble(Order::getTotalPrice))
                .orElse(null);

        System.out.println("Highest total price: " + (maxOrder != null ? maxOrder.getTotalPrice() : "No orders"));
    }
}

