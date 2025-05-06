package Level_5_custom_functional_interfaces;
// Level 5 – Custom Functional Interfaces and Real-Life Use Cases
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main
{
    public static void main(String[] args)
    {


        // 29. Using TriFunction to concatenate three strings
        TriFunction<String, String, String, String> concatThree = (a, b, c) -> a + b + c;

        System.out.println("\nOutput 29:");
        String concatenated = concatThree.apply("Functional", " ", "Interface"); // using apply
        System.out.println(concatenated);


        // ----------------------------------------------------------
        // 30. Function pipeline to process orders

        // Order class
        class Order
        {
            private String customerName;
            private double amount;
            private String status;

            Order(String customerName, double amount, String status)
            {
                this.customerName = customerName;
                this.amount = amount;
                this.status = status;
            }

            public String getCustomerName()
            {
                return customerName;
            }
            public double getAmount()
            {
                return amount;
            }
            public String getStatus()
            {
                return status;
            }
        }

        List<Order> orders = Arrays.asList(
                new Order("Anurag", 2500, "completed"),
                new Order("Vijay", 1800, "pending"),
                new Order("Sandeep", 3200, "completed"),
                new Order("Ayushi", 1200, "cancelled"),
                new Order("Gopal", 4000, "completed")
        );

        // Pipeline: Filter by status "completed", sort by amount descending, map to customer names
        List<String> processedCustomers = orders.stream()
                .filter(order -> order.getStatus().equalsIgnoreCase("completed"))
                .sorted(Comparator.comparingDouble(Order::getAmount).reversed())
                .map(Order::getCustomerName)
                .collect(Collectors.toList());

        System.out.println("\nOutput 30:");
        System.out.println(processedCustomers);

        System.out.println("\nLevel 5 Completed");
    }
}

