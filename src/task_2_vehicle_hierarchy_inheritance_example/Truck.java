package task_2_vehicle_hierarchy_inheritance_example;

public class Truck extends Vehicle
{

    Truck(int speed, int fuelCapacity)
    {
        super(speed, fuelCapacity);
    }

    //Override
    double getMileage()
    {
        return fuelCapacity * 8.0; // Example formula
    }
}

