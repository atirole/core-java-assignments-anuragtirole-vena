package task_5_employee_payroll_system_abstraction_example;

public class FullTimeEmployee extends Employee
{
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary)
    {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Implement salary calculation
    //Override
    public double calculateSalary()
    {
        return monthlySalary;
    }

    // Implement method to print employee details
    //Override
    public void getDetails()
    {
        System.out.println("Full-Time Employee: " + name + " (ID: " + id + ")");
        System.out.println("Monthly Salary: $" + monthlySalary);
    }
}

