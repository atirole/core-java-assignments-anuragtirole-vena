package Level_10_advanced_optional_and_stream_api;


// 52. Chain operations on a list of Orders: filter by date range, map to total amount, sum all totals.

import java.time.LocalDate;
import java.util.*;

public class Problem50
{
    static class Order
    {
        private LocalDate date;
        private double amount;

        public Order(LocalDate date, double amount)
        {
            this.date = date;
            this.amount = amount;
        }

        public LocalDate getDate()
        {
            return date;
        }
        public double getAmount()
        {
            return amount;
        }
    }

    public static void main(String[] args)
    {
        List<Order> orders = Arrays.asList(
                new Order(LocalDate.of(2023, 1, 10), 1200),
                new Order(LocalDate.of(2023, 3, 15), 900),
                new Order(LocalDate.of(2023, 5, 20), 1500),
                new Order(LocalDate.of(2024, 2, 5), 1800)
        );

        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);

        double totalInRange = orders.stream()
                .filter(order -> !order.getDate().isBefore(startDate) && !order.getDate().isAfter(endDate))
                .mapToDouble(Order::getAmount)
                .sum();

        System.out.println(totalInRange);
    }
}
