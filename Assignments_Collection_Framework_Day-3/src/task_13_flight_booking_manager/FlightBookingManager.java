package task_13_flight_booking_manager;

import java.util.*;

public class FlightBookingManager
{
    private Queue<String> bookingQueue = new LinkedList<>();
    private Map<String, Integer> confirmedBookings = new LinkedHashMap<>();
    private int nextSeatNumber = 1;

    // Add booking request to the queue
    public void addBookingRequest(String passengerName)
    {
        bookingQueue.offer(passengerName);
        System.out.println("Added booking request for: " + passengerName);
    }

    // Process all bookings from the queue
    public void processBookings()
    {
        while (!bookingQueue.isEmpty())
        {
            String passenger = bookingQueue.poll();
            confirmedBookings.put(passenger, nextSeatNumber++);
            System.out.println("Confirmed booking for " + passenger);
        }
    }

    // Print confirmed bookings
    public void printConfirmedBookings()
    {
        System.out.println("\nConfirmed Bookings:");
        for (Map.Entry<String, Integer> entry : confirmedBookings.entrySet())
        {
            System.out.println("Passenger: " + entry.getKey() + ", Seat No: " + entry.getValue());
        }
    }
}
