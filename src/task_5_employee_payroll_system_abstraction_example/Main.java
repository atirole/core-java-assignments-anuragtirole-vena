package task_5_employee_payroll_system_abstraction_example;

public class Main
{
    public static void main(String[] args)
    {    // Creating FullTimeEmployee object
        Employee emp1 = new FullTimeEmployee("Anurag Tirole", 101, 5000);
        // Creating Freelancer object
        Employee emp2 = new Freelancer("Vijay", 202, 50, 80);

        System.out.println("=== Employee Payroll System ===");

        emp1.getDetails();
        System.out.println("Calculated Salary: $" + emp1.calculateSalary() + "\n");

        emp2.getDetails();
        System.out.println("Calculated Salary: $" + emp2.calculateSalary());
    }
}

