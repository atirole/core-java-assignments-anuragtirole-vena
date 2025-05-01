package task_3_department_directory_with_sorted_employees;

public class Employee
{
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getter methods for each field
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return department;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return String.format("ID: %d | Name: %s | Dept: %s | Salary: %.2f", id, name, department, salary);
    }
}
