package task_14_restaurant_order_system;

import java.util.*;

public class RestaurantOrderSystem
{
    private Deque<Order> currentOrders = new LinkedList<>();
    private List<Order> orderHistory = new ArrayList<>();

    // Add order to front
    public void addOrderToFront(Order order)
    {
        currentOrders.addFirst(order);
        System.out.println("Added to front: " + order);
    }

    // Add order to rear
    public void addOrderToRear(Order order)
    {
        currentOrders.addLast(order);
        System.out.println("Added to rear: " + order);
    }

    // Remove order from front
    public void processFrontOrder()
    {
        if (!currentOrders.isEmpty())
        {
            Order order = currentOrders.removeFirst();
            orderHistory.add(order);
            System.out.println("Processed from front: " + order);
        }
    }

    // Remove order from rear
    public void processRearOrder()
    {
        if (!currentOrders.isEmpty())
        {
            Order order = currentOrders.removeLast();
            orderHistory.add(order);
            System.out.println("Processed from rear: " + order);
        }
    }

    // Show current orders
    public void showCurrentOrders()
    {
        System.out.println("\nCurrent Orders Queue:");
        for (Order order : currentOrders)
        {
            System.out.println(order);
        }
    }

    // Show order history
    public void showOrderHistory()
    {
        System.out.println("\nOrder History:");
        for (Order order : orderHistory)
        {
            System.out.println(order);
        }
    }
}
