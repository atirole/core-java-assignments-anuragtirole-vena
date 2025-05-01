package task_14_restaurant_order_system;

public class Main
{
    public static void main(String[] args)
    {
        RestaurantOrderSystem system = new RestaurantOrderSystem();

        // Adding orders
        system.addOrderToRear(new Order(1, "Burger"));
        system.addOrderToRear(new Order(2, "Fries"));
        system.addOrderToFront(new Order(3, "Salad"));
        system.addOrderToFront(new Order(4, "Soup"));

        // Processing orders
        system.processFrontOrder();  // Soup
        system.processRearOrder();   // Fries

        // Show remaining queue and history
        system.showCurrentOrders();
        system.showOrderHistory();
    }
}

