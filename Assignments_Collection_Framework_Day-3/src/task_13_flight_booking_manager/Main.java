package task_13_flight_booking_manager;

public class Main
{
    public static void main(String[] args)
    {
        FlightBookingManager manager = new FlightBookingManager();

        // Add some booking requests
        manager.addBookingRequest("Radha");
        manager.addBookingRequest("Govinda");
        manager.addBookingRequest("Ram");

        // Process bookings
        manager.processBookings();

        // Display confirmed bookings
        manager.printConfirmedBookings();
    }
}
