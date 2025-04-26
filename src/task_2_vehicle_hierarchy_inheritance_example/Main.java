package task_2_vehicle_hierarchy_inheritance_example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vehicle type (Car/Truck): ");
        String type = sc.nextLine();

        System.out.print("Enter speed (km/h): ");
        int speed = sc.nextInt();

        System.out.print("Enter fuel capacity (liters): ");
        int fuel = sc.nextInt();

        Vehicle vehicle;

        if (type.equalsIgnoreCase("Car"))
        {
            vehicle = new Car(speed, fuel);
        } else if (type.equalsIgnoreCase("Truck"))
        {
            vehicle = new Truck(speed, fuel);
        } else
        {
            System.out.println("Invalid vehicle type.");
            sc.close();
            return;
        }

        System.out.println("\n=== Vehicle Details ===");
        vehicle.showDetails();
        System.out.println("Mileage: " + vehicle.getMileage() + " km");

        sc.close();
    }
}
