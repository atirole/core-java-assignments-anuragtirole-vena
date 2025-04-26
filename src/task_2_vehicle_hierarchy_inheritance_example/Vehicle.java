package task_2_vehicle_hierarchy_inheritance_example;

public class Vehicle
{
    int speed;
    int fuelCapacity;

    Vehicle(int speed, int fuelCapacity)
    {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    void showDetails()
    {
        System.out.println("Speed        : " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }

    double getMileage()
    {
        return 0;
    }
}

