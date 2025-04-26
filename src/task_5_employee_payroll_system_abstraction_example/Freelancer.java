package task_5_employee_payroll_system_abstraction_example;

public class Freelancer extends Employee
{
    double hourlyRate;
    int hoursWorked;

    public Freelancer(String name, int id, double hourlyRate, int hoursWorked)
    {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement salary calculation
    //Override
    public double calculateSalary()
    {
        return hourlyRate * hoursWorked;
    }

    // Implement method to print employee details
    //Override
    public void getDetails()
    {
        System.out.println("Freelancer: " + name + " (ID: " + id + ")");
        System.out.println("Hourly Rate: $" + hourlyRate + ", Hours Worked: " + hoursWorked);
    }
}
