package task_5_employee_payroll_system_abstraction_example;
// Abstract class representing a general Employee
public abstract class Employee
{
    String name;
    int id;
    // Constructor
    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    // Abstract method to calculate salary (must be implemented by subclasses)
       public abstract double calculateSalary();
    // Abstract method to get employee details
       public abstract void getDetails();
}

