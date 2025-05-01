package task_3_department_directory_with_sorted_employees;

public class Main
{
    public static void main(String[] args)
    {
        EmployeeManager manager = new EmployeeManager();

        // Adding employees to manager
        manager.addEmployee(new Employee(1, "Govinda", "HR", 55000));
        manager.addEmployee(new Employee(2, "Radha", "HR", 48000));
        manager.addEmployee(new Employee(3, "Ram", "IT", 75000));
        manager.addEmployee(new Employee(4, "Anurag", "IT", 68000));
        manager.addEmployee(new Employee(5, "Vijay", "Sales", 62000));
        manager.addEmployee(new Employee(6, "Gopal", "Sales", 61000));
        manager.addEmployee(new Employee(7, "Mahesh", "Finance", 80000));
        manager.addEmployee(new Employee(8, "Sarthak", "Finance", 79000));
        manager.addEmployee(new Employee(9, "Sanskar", "IT", 67000));
        manager.addEmployee(new Employee(10, "Sandeep", "Sales", 60000));

        // Sort each department's employees by descending salary
        manager.sortEmployeesBySalaryInDepartments();

        // Print sorted department-wise employees
        manager.printDepartmentWiseEmployees();

        // Print top N paid employees across all departments
        int N = 5;
        System.out.println("\nTop " + N + " Paid Employees Across All Departments:");
        for (Employee emp : manager.getTopPaidEmployees(N))
        {
            System.out.println(emp);
        }
    }
}

