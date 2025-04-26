package task_2_vehicle_hierarchy_inheritance_example;

public class Car extends Vehicle
{

    Car(int speed, int fuelCapacity)
    {
        super(speed, fuelCapacity);
    }

    //Override
    double getMileage()
    {
        return fuelCapacity * 15.0; // Example formula
    }
}
