package Level_7_custom_types_and_nested_streams;

// Problem36.java
// You have a list of Order objects, each with a list of Items. Return a flat list of all item names.
import java.util.*;
import java.util.stream.*;

public class Problem36
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
        public String getName()
        {
            return name;
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
    }

    public static void main(String[] args)
    {
        List<Order> orders = Arrays.asList(
                new Order(Arrays.asList(new Item("Pen", 10), new Item("Notebook", 20))),
                new Order(Arrays.asList(new Item("Pencil", 5), new Item("Eraser", 3)))
        );

        List<String> itemNames = orders.stream()
                .flatMap(order -> order.getItems().stream())
                .map(Item::getName)
                .collect(Collectors.toList());

        System.out.println("All item names: " + itemNames);
    }
}

