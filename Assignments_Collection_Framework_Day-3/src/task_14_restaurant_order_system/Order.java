package task_14_restaurant_order_system;

public class Order
{
    private int orderId;
    private String item;

    public Order(int orderId, String item)
    {
        this.orderId = orderId;
        this.item = item;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public String getItem()
    {
        return item;
    }

    @Override
    public String toString()
    {
        return "Order #" + orderId + ": " + item;
    }
}
